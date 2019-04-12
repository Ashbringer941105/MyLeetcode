package tencent._20190405_;

import java.util.Scanner;

/**
 * @Author 宋宗垚
 * @Date 2019/4/5 19:59
 * @Description TODO
 */
public class MoNi1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }
}
