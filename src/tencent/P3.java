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
        int n = sc.nextInt(); // 卡牌数量
        int s = sc.nextInt(); // 小q的得分，也就是小q赢的次数
        List<Integer> data = new ArrayList<>();
        if (s==0){
            double d = Math.pow(2,n);
            System.out.println(d);
        }else {
            for (int i = 0;i<n;i++){//注意while处理多个case
                int ka = sc.nextInt(); // 0石头 1布 2剪刀
                if (i+1<s){
                    data.add(0);
                }else if (i+1 == s){
                    data.add(1);
                }else {
                    int d = (s*2+2 )*data.get(i-1);
                    data.add(d);
                }
            }

            System.out.println(data.get(n-1));
        }

    }
}
