package offer;

import java.util.Stack;

/**
 * @Author 宋宗垚
 * @Date 2019/3/26 11:35
 * @Description TODO
 */
public class _016_反转链表 {
    public ListNode ReverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head!=null){
            stack.push(head);
            head = head.next;
        }
        if (stack.empty()){
            return null;
        }else {
            ListNode result = stack.pop();
            result.next = null;
            ListNode temp = result;
            while (!stack.empty()){
                ListNode xx = stack.pop();
                xx.next = null;
                temp.next = xx;
                temp = xx;
            }
            return result;
        }
    }
}
