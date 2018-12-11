import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author 宋宗垚
 * @Date 2018/12/5 23:12
 * @Description 117. 填充同一层的兄弟节点 II
 * TODO:不会做
 */
/*
给定一个二叉树

struct TreeLinkNode {
  TreeLinkNode *left;
  TreeLinkNode *right;
  TreeLinkNode *next;
}
填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。

初始状态下，所有 next 指针都被设置为 NULL。

说明:

你只能使用额外常数空间。
使用递归解题也符合要求，本题中递归程序占用的栈空间不算做额外的空间复杂度。
示例:

给定二叉树，

     1
   /  \
  2    3
 / \    \
4   5    7
调用你的函数后，该二叉树变为：

     1 -> NULL
   /  \
  2 -> 3 -> NULL
 / \    \
4-> 5 -> 7 -> NULL
 */
public class PopulatingNextRightPointersinEachNodeII_117 {
//
//    static List<LinkedList<TreeLinkNode>> data = new ArrayList<>();
//    public void connect(TreeLinkNode root) {
//        if(root==null){
//            return;
//        }
//        if(root.left != null){
//            root.left.next =
//        }
//    }


//    public static void main(String[] args){
//        TreeLinkNode x1 = new TreeLinkNode(1);
//        TreeLinkNode x2 = new TreeLinkNode(2);
//        LinkedList<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
//        queue.add(x1);
//        queue.add(x2);
//        x2.val = 3;
//        System.out.println(queue.poll().val);
//        System.out.println(queue.poll().val);
//
//    }
}
