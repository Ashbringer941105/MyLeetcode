package bishiti.tencent;

import java.util.Scanner;

/**
 * @Author 宋宗垚
 * @Date 2019/3/9 19:41
 * @Description TODO
 */
public class P2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt(); // 问了多少次
//        while (in.hasNextInt()) {//注意while处理多个case
        for (int i = 0;i<q;i++){
            int l = in.nextInt();
            int r = in.nextInt();
            if (l%2==0){
                // 如果是偶数
                if(l==r){
                    System.out.println(l);
                }else {
                    int result = -(r-l+1)/2;
                    if ((r-l)%2 == 0){
                        // l,r均为偶数
                        System.out.println(result + r);
                    }else {
                        // r为奇数,l为偶数
                        System.out.println(result);
                    }
                }
            }else {
                // 如果是奇数
                if(l==r){
                    System.out.println(-l);
                }else {
                    int result = (r-l+1)/2;
                    if ((r-l)%2 == 0){
                        // l,r均为奇数
                        System.out.println(result - r);
                    }else {
                        System.out.println(result);
                    }
                }
            }

//            System.out.println(a + b);
        }
    }
}
