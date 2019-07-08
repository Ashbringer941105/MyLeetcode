package leetcode;

/**
 * @Author 宋宗垚
 * @Date 2018/12/5 19:31
 * @Description 112. 路径总和
 */
/*
给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。

说明: 叶子节点是指没有子节点的节点。

示例:
给定如下二叉树，以及目标和 sum = 22，

              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2。
 */
public class PathSum_112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
        return XX(root,0,sum);
    }
    public boolean XX(TreeNode root,int currentSum,int targetVal){

        if(root.left==null && root.right==null){
            // 如果没有子节点
            if(currentSum + root.val == targetVal){
                return true;
            }else {
                return false;
            }
        }
        boolean result1 = false;
        boolean result2 = false;
        if(root.left!=null){
            result1 = XX(root.left,currentSum+root.val,targetVal);
        }
        if(root.right!=null){
            result2 = XX(root.right,currentSum+root.val,targetVal);
        }
        return  result1||result2;


    }
}
