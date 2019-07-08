package leetcode;

/**
 * @Author 宋宗垚
 * @Date 2018/11/27 14:09
 * @Description 从前序与中序遍历序列构造二叉树
 */
/*
根据一棵树的前序遍历与中序遍历构造二叉树。

注意:
你可以假设树中没有重复的元素。

例如，给出

前序遍历 preorder = [3,9,20,15,7]
中序遍历 inorder = [9,3,15,20,7]
返回如下的二叉树：

    3
   / \
  9  20
    /  \
   15   7
 */
public class ConstructBinaryTreefromPreorderandInorderTraversal_105 {
//    public leetcode.TreeNode buildTree(int[] preorder, int[] inorder) {
//        if (preorder == null || preorder.length == 0) { return null; }
//        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
////        return buildTree1(preorder,inorder);
//
//    }
//
//    public leetcode.TreeNode buildTree(int[] preorder,int pLeft,int pRight,int[] inorder,int iLeft,int iRight){
//        if(pLeft>pRight || iLeft> iRight){
//            return null;
//        }
//        leetcode.TreeNode a = new leetcode.TreeNode(preorder[pLeft]);
//        // 查找前序遍历中的最前面的那个数，在中序遍历中的位置
//        int index =find(inorder,iLeft,iRight,a.val);
//
//        int lengthOfLeft = index-iLeft; // 当前节点左子树的节点个数
////        int[] x = Arrays.copyOfRange(preorder,0,preorder.length-1);
//        a.left = buildTree(preorder,pLeft+1,pLeft+1+lengthOfLeft-1,inorder,iLeft,index-1);
//        a.right = buildTree(preorder,pLeft+1+lengthOfLeft,pRight,inorder,index+1,iRight);
//        return a;
//
//    }
//    public int find(int[] a,int left,int right,int targer){
//        int result = -1;
//        for(int i = left;i<=right;i++){
//            if(a[i]==targer){
//                result=i;
//                break;
//            }
//        }
//        return result;
//    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0 || inorder.length==0){
            return null;
        }
        TreeNode result =bb(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
        return result;
    }
    public TreeNode bb(int[] preorder,int pLeft,int pRight, int[] inorder,int iLeft,int iRight){
        if(pLeft>pRight || iLeft>iRight){
            return null;
        }
        TreeNode root = new TreeNode(preorder[pLeft]);
        int index =find(inorder,root.val);
        int leftcount =index - iLeft;
        int rightcount = iRight-index;
        root.left = bb(preorder,pLeft+1,pLeft+leftcount,inorder,iLeft,index-1);
        root.right = bb(preorder,pLeft+leftcount+1,pRight,inorder,index+1,iRight);
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
