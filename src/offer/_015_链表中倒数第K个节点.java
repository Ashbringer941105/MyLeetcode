package offer;

import java.util.Stack;

/**
 * @Author 宋宗垚
 * @Date 2019/3/26 11:08
 * @Description TODO
 */
public class _015_链表中倒数第K个节点 {
    /**
     * 栈的方法
     * @param head
     * @param k
     * @return
     */
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

    /**
     * 前后双指针的方法
     * @param head
     * @param k
     * @return
     */
    public ListNode FindKthToTail2(ListNode head,int k) {
        if (head==null || k == 0){
            return null;
        }
        ListNode qian = head;
        ListNode behind = head;
        for (int i = 0;i<k;i++){
            if (qian!=null){
                qian = qian.next;
            }else {
                return null;
            }
        }
        while (qian!=null){
            qian = qian.next;
            behind = behind.next;
        }
        return behind;
    }
}
