package bishiti.tencent;

import java.util.*;

/**
 * @Author 宋宗垚
 * @Date 2019/3/9 20:17
 * @Description TODO
 */
class DLink{
    public DLink pre;
    public DLink back;
    public int val;
    public int jiangpin;
    DLink(int n){
        this.val = n;
        this.jiangpin = 1;
    }
}
public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> data = new ArrayList<>();
        DLink head = new DLink(0);

        head.pre = head;
        head.back = null;
        DLink last = head;
        for (int i =0;i<n;i++){
            int in = sc.nextInt();
            data.add(in);
            if (i==0){
                // 第一个
                head.val = in;
            }else if (i==n-1){
                // 最后一个
                DLink a = new DLink(in);
                last.back = a;
                a.pre = last;
                a.back = head;
                head.pre = a;
                last = a;
            }else {
                // 中间的
                DLink a = new DLink(in);
                last.back = a;
                a.pre = last;
                last = a;
            }
        }
        // 构造循环链表完成
        DLink diedaiqi = head;

        while (true){
            System.out.println(diedaiqi.val);

            if (diedaiqi.val>diedaiqi.pre.val && diedaiqi.val> diedaiqi.back.val){
                last.jiangpin = Math.max(diedaiqi.back.jiangpin,diedaiqi.pre.jiangpin) + 1;
            }
            if (diedaiqi==last){
                // 当迭代到最后的时候进行判断

                if ((last.val> head.val && last.val >last.pre.val) && !(last.jiangpin>head.jiangpin && last.jiangpin > last.pre.jiangpin)){

                }else {
                    break;
                }
            }


            diedaiqi = diedaiqi.back;
        }
        int sum =0;
        for (int i =0;i<n;i++){
            sum =sum + head.jiangpin;
            head = head.back;
        }
        System.out.println("jiangpin"+sum);

    }
}
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt(); // 打n枪
//    int m = sc.nextInt(); // m种颜色的个数
//    int result = -1;
//
//    List<Integer> list = new ArrayList<>();
//    Queue<Integer> queue = new LinkedList<>();
//        for (int i = 0;i<n;i++){//注意while处理多个case
//        int ka = sc.nextInt(); //
//        list.add(ka);
//        }
//        for (int i = 0;i<=n-m;i++){
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int j = i;j<n;j++){
//        if (list.get(j)!=0){
//        map.put(list.get(j),1);
//        }
//        if (map.size()==m){
//        if (result==-1){
//        result = j-i+1;
//        }else {
//        result = Math.min(result,j-i+1);
//        }
//        break;
//        }
//        }
//
//        }
//        System.out.println(result);