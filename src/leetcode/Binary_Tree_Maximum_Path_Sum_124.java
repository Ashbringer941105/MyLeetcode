package leetcode;

public class Binary_Tree_Maximum_Path_Sum_124 {
    public int maxPathSum(TreeNode root) {
        if (root.left==null && root.right==null){
            return root.val;
        }else if (root.left==null){
            return maxPathSum(root.right) + root.val;
        }else if (root.right==null){
            return maxPathSum(root.left) + root.val;
        }else {
            return Math.max(maxPathSum(root.right) + root.val,maxPathSum(root.left) + root.val);
        }
    }
}
