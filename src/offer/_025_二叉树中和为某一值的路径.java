package offer;

import java.util.ArrayList;

/**
 * @Author 宋宗垚
 * @Date 2019/4/3 21:55
 * @Description TODO
 */
public class _025_二叉树中和为某一值的路径 {

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

        ArrayList<ArrayList<Integer>> data = new ArrayList<>();
        if (root==null){
            return data;
        }
        ArrayList<Integer> list = new ArrayList<>();
        qianXuBianLi(root,target,data ,list,0);
        return data;

    }
    public void qianXuBianLi(TreeNode root,int target,ArrayList<ArrayList<Integer>> data,
                             ArrayList<Integer> temp_list,int temp_sum){
        if (root.left==null && root.right==null){
            // 如果是叶子结点
            ArrayList<Integer> new_list = new ArrayList<>(temp_list);
            new_list.add(root.val);
            temp_sum = temp_sum + root.val;

            if (temp_sum==target){
                data.add(new_list);
            }

        }else {
            // 如果不是叶子结点
            ArrayList<Integer> new_list = new ArrayList<>(temp_list);
            new_list.add(root.val);
            if (root.left!=null){
                // 左子节点不为空
                qianXuBianLi(root.left,target,data,new_list,temp_sum+root.val);
            }
            if (root.right!=null) {
                //右子节点不为空
                qianXuBianLi(root.right, target, data, new_list, temp_sum + root.val);
            }
        }

    }
}
