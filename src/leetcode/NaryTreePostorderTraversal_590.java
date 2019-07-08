package leetcode;

import java.util.ArrayList;
import java.util.List;

/*
给定一个 N 叉树，返回其节点值的后序遍历。

例如，给定一个 3叉树 :


返回其后序遍历: [5,6,3,2,4,1].

说明: 递归法很简单，你可以使用迭代法完成此题吗?
 */
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class NaryTreePostorderTraversal_590 {
    static List<Integer> result = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if(root==null){
            return result;
        }else {
            for(int i =0;i< root.children.size();i++){
                postorder(root.children.get(i));

            }
            result.add(root.val);
        }
        return result;
    }
}
