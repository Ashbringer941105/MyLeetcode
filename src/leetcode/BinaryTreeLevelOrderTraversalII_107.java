package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）

例如：
给定二叉树 [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
返回其自底向上的层次遍历为：

[
  [15,7],
  [9,20],
  [3]
]
 */
public class BinaryTreeLevelOrderTraversalII_107 {

    public static void main(String[] args){
        List<Integer> xx = new ArrayList<>();
        xx.add(1);
        int xxx = xx.get(1);
    }


    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // 想法：遍历这个树，并且记录深度，然后根据深度把value加入到对应深度的list中
        List<List<Integer>> data = new ArrayList<>();
        Bianli(root,0,data);
        Collections.reverse(data);
        return data;
    }
    public static void Bianli(TreeNode root,int deepth,List<List<Integer>> data){
        if(root==null){
            return;
        }else{
            //List<Integer> =
            if(data.size()-1<deepth) {
                // 如果这个节点是这一层的第一个
                List<Integer> a = new ArrayList<>();
                //a.add(root.val);
                data.add(a);
            }

            data.get(deepth).add(root.val);


            Bianli(root.left,deepth+1,data);
            Bianli(root.right,deepth+1,data);

        }
    }


}
