import java.util.ArrayList;
import java.util.List;

/*
给定一个二叉树，返回它的 后序 遍历。

示例:

输入: [1,null,2,3]
   1
    \
     2
    /
   3

输出: [3,2,1]
进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 */
public class BinaryTreePostorderTraversal_145 {
    List<Integer> result = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root ==null){
            return result;
        }else {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            result.add(root.val);
            return result;
        }

    }
}
