package leetcode;

/**
 * @Author 宋宗垚
 * @Date 2018/11/27 15:50
 * @Description 从中序与后序遍历序列构造二叉树
 */
/*
根据一棵树的中序遍历与后序遍历构造二叉树。

注意:
你可以假设树中没有重复的元素。

例如，给出

中序遍历 inorder = [9,3,15,20,7]
后序遍历 postorder = [9,15,7,20,3]
返回如下的二叉树：

    3
   / \
  9  20
    /  \
   15   7
 */
/*
中序遍历：左根右
后序遍历  左右根
 */
public class ConstructBinaryTreefromInorderandPostorderTraversal_106 {
//    public leetcode.TreeNode buildTree(int[] inorder, int[] postorder) {
//
//        return creatTree(inorder,0,inorder.length-1,postorder,0, postorder.length-1);
//    }
//    public leetcode.TreeNode creatTree(int[] inorder,int iLeft,int iRight,int[] postorder,int pLeft,int pRight){
//        if(iLeft>iRight || pLeft>pRight){
//            return null;
//        }
//        leetcode.TreeNode root = new leetcode.TreeNode(postorder[pRight]);
//        //root.val = postorder[pRight];
//        int index = 0;
//        for(int i=iLeft;i<=iRight;i++){
//            if(inorder[i]==root.val){
//                index = i;
//                break;
//            }
//        }
//        int leftcount = index-iLeft;
//        root.left = creatTree(inorder,iLeft,index-1,postorder,pLeft,pLeft+leftcount-1);
//        root.right = creatTree(inorder,index+1,iRight,postorder,pLeft+leftcount,pRight-1);
//
//        return root;
//    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length==0||postorder.length==0){
            return null;
        }
        return bb(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
    public TreeNode bb(int[] inorder,int iLeft,int iRight, int[] postorder,int pLeft,int pRight){
        if(iLeft>iRight || pLeft>pRight){
            return null;
        }
        TreeNode root = new TreeNode(postorder[pRight]);
        int index =find(inorder,root.val);
        int leftcount = index - iLeft;
        int rightcount = iRight-index;
        root.left = bb(inorder,iLeft,index-1,postorder,pLeft,pLeft+leftcount-1);
        root.right = bb(inorder,index+1,iRight,postorder,pLeft+leftcount,pRight-1);
        return root;
    }
    public int find(int[] A,int tar) {
        int index = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == tar) {
                index = i;
                break;
            }
        }
        return index;
    }

}
