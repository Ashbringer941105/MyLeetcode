package bishiti.HUAWEI._20190424_;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!"".equals(input)){
            boolean result = isDuiChen(input) && isOuShu(input) && isChengDui(input);
            if (result){
                System.out.println(getDanDui(input));
            }else {
                System.out.println("false");
            }
            input = sc.nextLine();
        }
    }

    public static String getDanDui(String str){
        String result = "";
        for (int i = 0;i<str.length();i=i+2){
            result += str.charAt(i);
        }
        return result;
    }


    public static boolean isDuiChen(String str){
        if (str==null){
            return false;
        }
        boolean result = true;
        String fanzhuan = new StringBuilder(str).reverse().toString();
        for(int i = 0;i<str.length();i++){
            if (str.charAt(i)!= fanzhuan.charAt(i)){
                result = false;
            }
        }
        return result;
    }

    public static boolean isOuShu(String str){
        if (str==null){
            return false;
        }
        boolean result = false;
        if(str.length()%2==0){
            result = true;
        }
        return result;
    }

    public static boolean isChengDui(String str){
        if (str==null){
            return false;
        }
        if (str.length()%2!=0){
            return false;
        }
        boolean result = true;
        for (int i = 0;i<str.length();i=i+2){
            if (str.charAt(i)!=str.charAt(i+1)){
                result = false;
            }
        }
        return result;
    }
}
