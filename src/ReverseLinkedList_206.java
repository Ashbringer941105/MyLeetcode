import java.util.Stack;

/**
 * @Author 宋宗垚
 * @Date 2019/2/25 22:13
 * @Description TODO
 */
public class ReverseLinkedList_206 {

    public ListNode reverseList(ListNode head) {
        if(head==null ||head.next==null){
            return head;
        }
        ListNode h = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return h;


    }
}
