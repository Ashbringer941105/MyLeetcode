package bishiti.HUAWEI;

import java.util.Scanner;

/**
 * @Author 宋宗垚
 * @Date 2019/3/27 19:04
 * @Description TODO
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner scint = new Scanner(System.in);
        Scanner scstr = new Scanner(System.in);
        int n = Integer.parseInt(scstr.nextLine());
        String input = scstr.nextLine();
        String output = "";
//        char[] chars = input.toCharArray();
//        ArrayList<String> splitData = new ArrayList<>();
        for (int i = 0;i<n;i++){
            if (i!=0){
                output = output + " ";
            }
            String sub = input.substring(0,9);
            if (sub.startsWith("1")){
                sub = sub.substring(1);
                output = output + sub;
            }else {
                sub = sub.substring(1);
                sub = reverse(sub);
                output = output + sub;
            }
            input = input.substring(9);
        }
        System.out.println(output);

    }
    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
