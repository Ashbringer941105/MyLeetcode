package offer;

/**
 * @Author 宋宗垚
 * @Date 2019/3/26 13:54
 * @Description TODO
 */
public class _019_二叉树的镜像 {
    public void Mirror(TreeNode root) {
        if (root==null){
            return;
        }
        Mirror(root.left);
        Mirror(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
