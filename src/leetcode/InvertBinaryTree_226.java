package leetcode;/*
翻转一棵二叉树。

示例：

输入：

     4
   /   \
  2     7
 / \   / \
1   3 6   9
输出：

     4
   /   \
  7     2
 / \   / \
9   6 3   1
备注:
这个问题是受到 Max Howell 的 原问题 启发的 ：

谷歌：我们90％的工程师使用您编写的软件(Homebrew)，但是您却无法在面试时在白板上写出翻转二叉树这道题，这太糟糕了。
 */

public class InvertBinaryTree_226 {
//    public leetcode.TreeNode invertTree(leetcode.TreeNode root) {
//        if(root ==null){
//            return null;
//        }else {
//            leetcode.TreeNode left = invertTree(root.left);
//            leetcode.TreeNode right = invertTree(root.right);
//            root.left = right;
//            root.right = left;
//            return root;
//        }
//
//    }
    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
//        }else if (root.left==null && root.right==null){
//            return root;
//        }else if(root.left == null){
//            root.left = root.right;
//            root.right= null;
//            return root;
//        }else if(root.right == null){
//            root.right = root.left;
//            root.left = null;
//            return root;
        }else {
            TreeNode temp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(temp);
            return root;

        }
    }
}
