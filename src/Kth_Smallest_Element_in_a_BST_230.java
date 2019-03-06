import java.util.ArrayList;
import java.util.List;

/**
 * @Author 宋宗垚
 * @Date 2019/3/6 16:41
 * @Description 230. 二叉搜索树中第K小的元素
 */
public class Kth_Smallest_Element_in_a_BST_230 {

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> data = new ArrayList<>();
        ff(root,data);
        return data.get(k-1);
    }
    public void ff(TreeNode root,List<Integer> data){
        if (root==null){
            return;
        }else {
            ff(root.left,data);
            data.add(root.val);
            ff(root.right,data);
        }
    }
}
