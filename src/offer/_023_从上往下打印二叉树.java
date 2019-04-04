package offer;

import java.util.ArrayList;
import java.util.Queue;

/**
 * @Author 宋宗垚
 * @Date 2019/4/3 16:41
 * @Description TODO
 */
public class _023_从上往下打印二叉树 {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> data = new ArrayList<>();
        if (root==null){
            return data;
        }else {
            ArrayList<TreeNode> list = new ArrayList<>();
            list.add(root);
            data = pfttb(list,data,0);
            return data;
        }

    }
    public ArrayList<Integer> pfttb(ArrayList<TreeNode> list,ArrayList<Integer> data,int index){
        if (index==list.size()){
            return data;
        }else {
            TreeNode node = list.get(index);
            data.add(node.val);
            if (node.left!=null){
                list.add(node.left);
            }
            if (node.right!=null){
                list.add(node.right);
            }

            return pfttb(list,data,index+1);

        }
    }
}
