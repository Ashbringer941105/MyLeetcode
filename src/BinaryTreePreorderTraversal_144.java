import java.util.ArrayList;
import java.util.List;

/*

给定一个二叉树，返回它的 前序 遍历。

 示例:

输入: [1,null,2,3]
   1
    \
     2
    /
   3

输出: [1,2,3]
进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 */
public class BinaryTreePreorderTraversal_144 {
    List<Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return result;
        }else {
            result.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
            return result;
        }

    }
}
