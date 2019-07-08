package bishiti.bytedance;

import java.util.*;

public class custumlike {

//    public static HashMap<Integer, Node> hashMap = new HashMap<>();
//
//    static class Node{
//        private int position;
//        private Node Next;
//        public Node(int position) {
//            this.position = position;
//        }
//        public void addNode(Node newNode) {
//            if (this.Next == null) {
//                this.Next = newNode;
//            } else {
//                this.Next.addNode(newNode);
//            }
//        }
//    }
//
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        // n是总的人数 q是代表查询的组数，l是查询的左边界r是查询的右边界，k是查询的值，
//        int n,q,l,r,k,num;
//        n = in.nextInt();
//        for (int i = 1; i <= n; i++) {
//            num = in.nextInt();
//            Node node = new Node(i);
//            if (hashMap.get(num) != null) {//判断hashmap中是否存在该用户喜好，存在就添加到链尾
//                hashMap.get(num).addNode(node);
//            } else if (hashMap.get(num) == null) {//不存在就添加为头结点
//                hashMap.put(num, node);
//            }
//        }
//
//        q = in.nextInt();
//        for (int i = 0; i < q; i++) {
//            l = in.nextInt();
//            r = in.nextInt();
//            k = in.nextInt();
//            int count = 0;
//            Node root = hashMap.get(k);// 获取洗好这个k的所有人的一个链表
//            while (root != null && root.position <= r) {
//                // 对链表进行循环，如果链表中的node中的值在l和r之间，则对count+1
//                if (root.position >= l && root.position <= r) {
//                    count++;
//                }
//                root = root.Next;
//            }
//            System.out.println(count);
//        }
//
//
//    }

    public static HashMap<Integer,Node> data = new HashMap<>();
    static class Node{
        private int value;
        private Node next;
        public Node(int n){
            value = n;
        }
        public void addOne(Node newNode){
            if(this.next==null){
                this.next = newNode;
            }else {
                this.next.addOne(newNode);
            }
        }

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0;i<n;i++){
            Node a = new Node(i);
            int temp = in.nextInt();
            if(data.get(temp) !=null){
                // 如果may中已经有了这个数，则向这个数的value的list中加入这个坐标
                data.get(temp).addOne(a);
            }else {
                // 如果map中还没有这个数值，则新建一个加进去
//                List<Integer> aa= new ArrayList<>();
//                aa.add(i);
//                data.put(temp,aa);
                data.put(temp,a);
            }
        }

        int q = in.nextInt();
        for(int i = 0;i<q;i++){
            int l = in.nextInt()-1;
            int r = in.nextInt()-1;
            int k = in.nextInt();
            int count = 0;
            //List<Integer> ttt = data.get(k);
            Node nn = data.get(k);
            while (nn!=null && nn.value<=r) {
                if (nn.value >= l && nn.value <= r) {
                    count++;
                }
                nn = nn.next;
            }
            System.out.println(count);

        }





    }



}
