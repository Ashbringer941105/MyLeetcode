package bishiti.tencent;

import java.util.Scanner;

/**
 * @Author 宋宗垚
 * @Date 2019/3/9 19:33
 * @Description TODO
 */
public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//最大面额
        int m = sc.nextInt(); // 价格
        int count = 0;
        if (m==0){
            System.out.println(0);
        }else {
            if (m<=n){
                // 如果最大面额大于价格，只用一个
                System.out.println(1);
            }else {
                 // 如果价格大于最大面额，则
                count = m/n;
                int yushu = m%n;
                if (yushu!=0){
                    count++;
                }
                System.out.println(count);
            }
        }


    }
}
