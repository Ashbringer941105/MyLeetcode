package tencent._20190405_;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author 宋宗垚
 * @Date 2019/4/5 19:59
 * @Description TODO
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] mianzhi = new int[n];
        for (int i =0;i<n;i++){
            mianzhi[i] = sc.nextInt();
        }
        ArrayList<ArrayList<Integer>> data = new ArrayList<>();
        for (int i = 1;i<=m;i++){
            ArrayList<Integer> t = null;
            if (i==1){
                t = new ArrayList<>();
            }else {
                t = new ArrayList<>(data.get(i-2));
            }


        }

    }
}
