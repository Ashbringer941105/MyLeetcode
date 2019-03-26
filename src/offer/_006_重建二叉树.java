package offer;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class _006_重建二叉树 {
//    public static void main(String[] args){
//        int[] pre = {1,2,4,7,3,5,6,8};
//        int[] in = {4,7,2,1,5,3,8,6};
//        TreeNode xx = reConstructBinaryTree(pre,in);
//        int i = 0;
//
//    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre.length==0 || in.length==0){
            return null;
        }
        TreeNode node = ff(pre,0,pre.length-1,in,0,in.length-1);
        return node;
    }
    public TreeNode ff(int [] pre,int pLeft,int pRight,int [] in,int iLeft,int iRight){
        if (pLeft>pRight || iLeft>iRight ){
            return null;
        }
        TreeNode node = new TreeNode(pre[pLeft]);
        int index = 0;
        for (int i =0;i<in.length;i++){
            if (in[i]==pre[pLeft]){
                break;
            }
            index++;
        }
        int len = index - iLeft;
        node.left = ff(pre,pLeft+1,pLeft+len,in,iLeft,index-1);
        node.right = ff(pre,pLeft+len+1,pRight,in,index+1,iRight);
        return node;
    }
}
