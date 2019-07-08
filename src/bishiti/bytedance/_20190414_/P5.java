package bishiti.bytedance._20190414_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P5 {
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int i = 0;i<n;i++){
        int count = in.nextInt();
        ArrayList<Integer> data = new ArrayList<>();
        for (int c=0;c<count;c++){
            data.add(in.nextInt());
        }
        Collections.sort(data);
//        for (int c=0;c<count;c++){
//            System.out.println(data.get(c));
//        }
        int[] time = new int[count];
//        int result =

    }
}
//public static int jiSuan(ArrayList<Integer> data,int[] time,int index){
//    if (index == 2){
//        time[0]=data.get(1);
//        time[1] = data.get(1);
//    }else if (index==3){
//        time[0]=data.get(2);
//        time[1] = data.get(2);
//        time[2] = data.get(2);
//    }else {
//
//    }
//}
}
