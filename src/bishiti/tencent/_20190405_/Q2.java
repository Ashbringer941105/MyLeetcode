package bishiti.tencent._20190405_;

import java.util.Scanner;

/**
 * @Author 宋宗垚
 * @Date 2019/4/5 20:10
 * @Description TODO
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        int n = Integer.parseInt(sc2.nextLine());
        String str = sc2.nextLine();
        boolean flag = true;
        while (true){
            str = str.replace("10","");
            str = str.replace("01","");
            if (str.length()==n){
                break;
            }else {
                n = str.length();
            }
        }
        System.out.println(str.length());

    }

}
