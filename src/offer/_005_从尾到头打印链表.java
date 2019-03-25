package offer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}
public class _005_从尾到头打印链表 {

    public static void main(String[] args){
//        ArrayList<Integer> data = new ArrayList<>();
//        data.add(1);
//        data.add(2);
//        Collections.reverse(data);
       // data.stream().forEach(System.out::print);
        //printListFromTailToHead(null);
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> temp = new Stack<>();
        ArrayList<Integer> data = new ArrayList<>();
        ListNode t = listNode;
        while (t!=null){
            temp.push(t.val);
            t = t.next;
        }
        while (!temp.empty()){
            data.add(temp.pop());
        }
        return data;
    }
}
