package leetcode;

/**
 * @Author 宋宗垚
 * @Date 2019/3/10 12:53
 * @Description 404. 左叶子之和
 */
public class Sum_of_Left_Leaves_404 {
    public static int result = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        result = 0;
        if (root==null){
            return 0;
        }else {
            ff(root.left,true);
            ff(root.right,false);
            return result;
        }
    }

    public void ff(TreeNode root,boolean isLeft){
        if (root==null){
            return ;
        }else {
            if (root.left==null && root.right==null && isLeft){
                result = result + root.val;
            }else{
                ff(root.left,true);
                ff(root.right,false);
            }
        }
    }

}
