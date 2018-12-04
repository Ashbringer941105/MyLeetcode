/**
 * @Author 宋宗垚
 * @Date 2018/11/30 22:37
 * @Description TODO
 */
/*
给定一个二叉树，找出其最小深度。

最小深度是从根节点到最近叶子节点的最短路径上的节点数量。

说明: 叶子节点是指没有子节点的节点。

示例:

给定二叉树 [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
返回它的最小深度  2.
 */
public class MinimumDepthofBinaryTree_111 {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.right==null && root.right==null){
            return 1;
        }
        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;
        if(root.left !=null){
            left = minDepth(root.left);
        }
        if(root.right!=null){
            right = minDepth(root.right);
        }

        return Math.min(right,left)+1;
    }
    public int minDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        int left, right;
        if (root.left != null) left = minDepth1(root.left);
        else left = Integer.MAX_VALUE;
        if (root.right != null) right = minDepth1(root.right);
        else right = Integer.MAX_VALUE;
        return Math.min(left, right) + 1;
    }

}
