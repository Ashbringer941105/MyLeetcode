package bishiti.HUAWEI;

import java.util.Scanner;

/**
 * @Author 宋宗垚
 * @Date 2019/3/27 19:01
 * @Description TODO
 */
public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0, x;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                x = sc.nextInt();
                ans += x;
            }
        }
        System.out.println(ans);
    }
}
