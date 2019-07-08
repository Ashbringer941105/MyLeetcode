package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 宋宗垚
 * @Date 2019/3/4 21:10
 * @Description 429. N叉树的层序遍历
 */
public class N_ary_Tree_Level_Order_Traversal_429 {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> data = new ArrayList<>();
        dp(root,data,0);
        return data;
    }
    public void dp(Node root,List<List<Integer>> data,int deepth){
        if (root!=null){
            List<Integer> temp;
            if (data.size()>deepth){
                temp = data.get(deepth);
            }else {
                temp = new ArrayList<>();
                data.add(temp);
            }
            temp.add(root.val);
            for (Node n : root.children){
                dp(n,data,deepth+1);
            }

        }
    }
}
