package tencent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author 宋宗垚
 * @Date 2019/3/9 20:01
 * @Description TODO
 */
public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int n = sc.nextInt(); // 数量
        int[] data;
        for(int i = 0;i<n;i++){
            String ss = sc2.nextLine();
            String result = ff(ss,0,ss.length());
            System.out.println(result);
        }
    }
    public static String ff(String ss,int index,int len){
        String dddd = "";
        if (index == len){
            dddd = ss;
            return ss;
        }else {
            if (index <2){
                dddd = ff(ss,index+1,len);
                return dddd;

            }else {
                char last = ss.charAt(index);
                char last_1 = ss.charAt(index-1);
                char last_2 = ss.charAt(index-2);
                if (last==last_1 && last==last_2){
                    ss = ss.substring(0,index) + ss.substring(index+1);
                    dddd = ff(ss,index,len-1);
                    return dddd;
                }else if (index>=3){
                    char last_3 = ss.charAt(index-3);
                    if (last==last_1 && last_2==last_3) {
                        ss = ss.substring(0, index) + ss.substring(index + 1);
                        dddd = ff(ss, index, len - 1);
                        return dddd;
                    }else {
                        dddd = ff(ss,index+1,len);
                        return dddd;
                    }
                }else {
                    dddd = ff(ss, index+1, len);
                    return dddd;

                }
            }
        }
//        return dddd;
    }
}
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt(); // 卡牌数量
//    int s = sc.nextInt(); // 小q的得分，也就是小q赢的次数
//    List<Integer> data = new ArrayList<>();
//        if (s==0){
//                double d = Math.pow(2,n);
//                System.out.println(d);
//                }else {
//                for (int i = 0;i<n;i++){//注意while处理多个case
//        int ka = sc.nextInt(); // 0石头 1布 2剪刀
//        if (i+1<s){
//        data.add(0);
//        }else if (i+1 == s){
//        data.add(1);
//        }else {
//        int d = (s*2+2 )*data.get(i-1);
//        data.add(d);
//        }
//        }
//
//        System.out.println(data.get(n-1));
//        }
