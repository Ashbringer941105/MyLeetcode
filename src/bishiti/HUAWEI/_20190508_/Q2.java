package bishiti.HUAWEI._20190508_;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 将n个礼物分给k个小朋友
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<String> strings = new ArrayList<>();
        int number = fenPingGuo(n,k,strings,"");
        System.out.println(number);
        for (String s : strings){
            System.out.println(s);
        }


    }
    // 递归的解决问题。
    public static int fenPingGuo(int numOfApple ,int numOfChild,ArrayList<String> data,String tempStr){
        if (numOfApple==0 || numOfChild==1){
            for (int a = 0;a<numOfApple;a++){
                tempStr = tempStr + "*";
            }
            for (int c=0;c<numOfChild-1;c++){
                tempStr = tempStr + "|";
            }
            data.add(tempStr);
            return 1;
        }
        int sum = 0;
        for (int i = 0;i<=numOfApple;i++){
            String newStr = new String(tempStr);
            for (int j = 0;j<i;j++){
                newStr = newStr + '*';
            }
            newStr = newStr + '|';
            sum = sum + fenPingGuo(numOfApple-i,numOfChild-1,data,newStr);
        }
        return sum;
    }
}
