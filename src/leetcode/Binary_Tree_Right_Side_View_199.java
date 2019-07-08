package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 宋宗垚
 * @Date 2019/3/6 15:53
 * @Description 199. 二叉树的右视图
 */
public class Binary_Tree_Right_Side_View_199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> data = new ArrayList<>();

        data = ff(root,data,0);
        List<Integer> result = new ArrayList<>();
        for (List<Integer> i : data){
            result.add(i.get(i.size()-1));
        }
        return result;
    }

    /**
     * 层次遍历树
     * @param root
     * @param data
     */
    public List<List<Integer>> ff(TreeNode root,List<List<Integer>> data,int deepth){
        if (root==null){
            return data;
        }else {
            if (data.size()<deepth){
                List<Integer> xxx = new ArrayList<>();
                xxx.add(root.val);
                data.add(xxx);
            }else {
                data.get(deepth).add(root.val);
            }
            ff(root.left,data,deepth+1);
            ff(root.right,data,deepth+1);
            return data;
        }
    }
}
