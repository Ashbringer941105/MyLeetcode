package offer;


/**
 * @Author 宋宗垚
 * @Date 2019/3/26 11:41
 * @Description TODO
 */
public class _017_合并两个排序的链表 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1==null && list2==null) {
            return null;
        }else if (list1==null){
            return list2;
        }else if (list2==null){
            return list1;
        }else {
            ListNode temp;
            if (list1.val<list2.val){
                temp = list1;
                temp.next = Merge(list1.next,list2);
            }else {
                temp = list2;
                temp.next = Merge(list1,list2.next);
            }
            return temp;
        }
    }
}
