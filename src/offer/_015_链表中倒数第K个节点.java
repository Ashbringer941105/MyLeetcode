package offer;

import java.util.Stack;

/**
 * @Author 宋宗垚
 * @Date 2019/3/26 11:08
 * @Description TODO
 */
public class _015_链表中倒数第K个节点 {
    public ListNode FindKthToTail(ListNode head,int k) {
        Stack<ListNode> stack = new Stack<>();
        while (head!=null){
            stack.push(head);
            head = head.next;
        }
        if (stack.size()<k || k==0){
            return null;
        }else {
            for (int i = 0;i<k-1;i++){
                stack.pop();
            }
            return stack.peek();
        }
    }
}
