package Tree;

import sun.reflect.generics.tree.Tree;

/**
 * @Author 宋宗垚
 * @Date 2019/3/1 14:39
 * @Description 701二叉搜索树的插入操作
 */
public class InsertintoaBinarySearchTree_701 {

    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode target = find(root,val,null);
        if(target.val==val){
            return target;
        }else{
            return null;
        }
    }

    /**
     * 在二叉排序树中查找指定值的节点
     * @param root 输入的根节点
     * @param key 要查找的值
     * @param p 输入的根节点的双亲
     * @return 查找到之后存储目标节点的对象,如果没查找到，则给他的对象是距离key最近的值,也就是插入操作中应该插入该节点的父节点
     */
    public TreeNode find(TreeNode root, int key,TreeNode p){
        TreeNode result = null;
        if(root==null){
            return p;
        }else if (root.val==key){
            p = root;
            return p;
        }else if (root.val > key){
            return find(root.left,key,root);
        }else if (root.val < key){
            return find(root.right,key,root);
        }
        return result;
    }
}
