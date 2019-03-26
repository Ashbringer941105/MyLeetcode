package offer;

/**
 * @Author 宋宗垚
 * @Date 2019/3/26 13:39
 * @Description TODO
 */
public class _018_树的子结构 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
        if (root1!=null && root2!=null){
            if (root1.val == root2.val){
                 result = DoseTree1HasTree2(root1,root2);
            }
            if (!result){
                result = HasSubtree(root1.left,root2) ;
            }
            if (!result){
                result = HasSubtree(root1.right,root2) ;
            }
        }
        return result;
    }
    public boolean DoseTree1HasTree2(TreeNode root1,TreeNode root2){
        if (root2==null){
            return true;
        }
        if (root1==null){
            return false;
        }
        if (root1.val != root2.val){
            return false;
        }

        return DoseTree1HasTree2(root1.left,root2.left) && DoseTree1HasTree2(root1.right,root2.right);
    }
}
