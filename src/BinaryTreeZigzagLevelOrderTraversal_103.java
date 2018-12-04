import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author 宋宗垚
 * @Date 2018/11/27 13:25
 * @Description 二叉树的锯齿形遍历
 */
/*
给定一个二叉树，返回其节点值的锯齿形层次遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。

例如：
给定二叉树 [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
返回锯齿形层次遍历如下：

[
  [3],
  [20,9],
  [15,7]
]
 */
public class BinaryTreeZigzagLevelOrderTraversal_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> data = new ArrayList<>();
        ff(root,data,0);
        for(int i = 0;i<data.size();i++){
            if(i%2==1){
               Collections.reverse(data.get(i));
            }
        }
        return data;
    }

    public void ff(TreeNode root,List<List<Integer>> data,int deepth){
        if(root==null){
            return;
        }
        if(data.size()-1<deepth){
            List<Integer> a = new ArrayList<>();
            data.add(a);
        }
        // 先一律从左向右加进去，后面再反转
        data.get(deepth).add(root.val);
        ff(root.left,data,deepth+1);
        ff(root.right,data,deepth+1);

    }


}
