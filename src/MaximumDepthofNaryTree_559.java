import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
给定一个 N 叉树，找到其最大深度。

最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。

例如，给定一个 3叉树 :

我们应返回其最大深度，3。

说明:

树的深度不会超过 1000。
树的节点总不会超过 5000。
 */
public class MaximumDepthofNaryTree_559 {
    //int max = 0;
    public int maxDepth(Node root) {
        if(root==null){
            return 0;
        }else {
            int max = 0;
            List<Integer> x = new ArrayList<>();
            for(int i = 0;i<root.children.size();i++){
                int deep = maxDepth(root.children.get(i));
                x.add(deep);
            }
            for(int i = 0;i<x.size();i++){
                if(x.get(i)>max){
                    max = x.get(i);
                }
            }
            return max+1;
        }
    }
}
