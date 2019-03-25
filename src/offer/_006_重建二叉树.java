package offer;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class _006_重建二叉树 {
    public static void main(String[] args){
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        reConstructBinaryTree(pre,in);

    }
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre.length==0 || in.length==0){
            return null;
        }
        TreeNode node = ff(pre,0,pre.length-1,in,0,in.length-1);
        return node;
    }
    public static TreeNode ff(int [] pre,int pLeft,int pRight,int [] in,int iLeft,int iRight){
        if (pLeft>pRight || iLeft>iRight ){
            return null;
        }
        TreeNode node = new TreeNode(pre[pLeft]);
        int len = 0;
        for (int i =0;i<in.length;i++){
            if (in[i]==pre[pLeft]){
                break;
            }
            len++;
        }

        node.left = ff(pre,pLeft+1,pLeft+len,in,iLeft,iLeft+len-1);
        node.right = ff(pre,pLeft+len+1,pRight,in,iLeft+len+1,iRight);
        return node;
    }
}
