/**
 * @Author 宋宗垚
 * @Date 2019/3/6 17:34
 * @Description 235. 二叉搜索树的最近公共祖先
 */
public class Lowest_Common_Ancestor_of_a_Binary_Search_Tree_235 {
    TreeNode res = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        lca(root, p , q);
        return res;
    }

    public void lca(TreeNode root, TreeNode p , TreeNode q){
        if((root.val - p.val)*(root.val - q.val) <= 0){
            res = root;
        }else if(root.val < p.val && root.val < q.val){
            lca(root.right, p , q);
        }else{
            lca(root.left, p , q);
        }
    }
}
