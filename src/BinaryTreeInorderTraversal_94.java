import java.util.ArrayList;
import java.util.List;

/*
给定一个二叉树，返回它的中序 遍历。

示例:

输入: [1,null,2,3]
   1
    \
     2
    /
   3

输出: [1,3,2]
进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 */
public class BinaryTreeInorderTraversal_94 {
    List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return  result;
        }else {
            inorderTraversal(root.left);
            result.add(root.val);
            inorderTraversal(root.right);
            return result;
        }
    }

}
