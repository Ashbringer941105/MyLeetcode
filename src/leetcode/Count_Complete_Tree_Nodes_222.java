package leetcode;

/**
 * @Author 宋宗垚
 * @Date 2019/3/6 16:31
 * @Description 222. 完全二叉树的节点个数
 */
public class Count_Complete_Tree_Nodes_222 {
    public static int count = 0;
    public int countNodes(TreeNode root) {
        count = 0;
        ff(root);
        return count;

    }
    public void ff(TreeNode root){
        if (root==null){
            return;
        }else {
            count++;
            ff(root.left);
            ff(root.right);
        }

    }
}
