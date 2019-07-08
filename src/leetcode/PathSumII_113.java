package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 宋宗垚
 * @Date 2018/12/5 19:42
 * @Description 113. 路径总和 II
 *
 */
/*
给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。

说明: 叶子节点是指没有子节点的节点。

示例:
给定如下二叉树，以及目标和 sum = 22，

              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
返回:

[
   [5,4,11,2],
   [5,8,4,5]
]
 */
public class PathSumII_113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }

        List<Integer> x = new ArrayList<>();
        return XX(root,0,sum,x,result);

    }
    public List<List<Integer>> XX(TreeNode root,int currentSum,int targetSum,List<Integer> data,List<List<Integer>> result){
        if(root.left==null && root.right==null){
            // 如果达到了根节点
            if(currentSum+root.val==targetSum) {
                List<Integer> x = new ArrayList<>();
                x.addAll(data);
                x.add(root.val);
                result.add(x);
            }
            return result;
        }
        if(root.left!=null){
            List<Integer> x2 = new ArrayList<>();
            x2.addAll(data);
            x2.add(root.val);
            result = XX(root.left,currentSum+root.val,targetSum,x2,result);
        }
        if(root.right!=null){
            List<Integer> x3 = new ArrayList<>();
            x3.addAll(data);
            x3.add(root.val);
            result = XX(root.right,currentSum+root.val,targetSum,x3,result);
        }
        return result;


    }

}
