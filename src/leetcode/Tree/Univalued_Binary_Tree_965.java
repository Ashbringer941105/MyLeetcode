package leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 宋宗垚
 * @Date 2019/3/3 15:35
 * @Description 单值二叉树
 */
public class Univalued_Binary_Tree_965 {


    public boolean isUnivalTree(TreeNode root) {
        if (root==null){
            return true;
        }else {
            List<Integer> list = new ArrayList<>();
            bl(root,list);
            int first = root.val;
            for (Integer i : list){
                if (i!=first){

                    return false;
                }
            }
            return true;
        }

    }
    public void bl(TreeNode root,List<Integer> list){
        if (root!=null){
            list.add(root.val);
            bl(root.left,list);
            bl(root.right,list);
        }
    }


}
