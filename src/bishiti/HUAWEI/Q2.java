package bishiti.HUAWEI;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author 宋宗垚
 * @Date 2019/3/27 19:34
 * @Description TODO
 */
public class Q2 {
    public static void main(String[] args){
        Scanner scint = new Scanner(System.in);
//        Scanner scstr = new Scanner(System.in);
        int[] indexs = new int[12];
        indexs[0] = 0;
        indexs[1] = 0;
        for (int i = 2;i<12;i=i+2){
            int x = scint.nextInt();
            int y = scint.nextInt();
            indexs[i] = x;
            indexs[i+1] = y;
        }
        ArrayList<Integer> resData = new ArrayList<>();
        resData.add(1);
        resData.add(2);
        resData.add(3);
        resData.add(4);
        resData.add(5);
        int result = deep(resData,indexs,0.0,0,0);
        System.out.println(result);

    }
    public static int deep(ArrayList<Integer> resData,int[] indexs,double value,int preX,int preY){
        if (resData.isEmpty()){
            value = value + Math.sqrt(Math.pow(0-preX,2)+Math.pow(0-preY,2));
            return (int)value;
        }else {
            int min = Integer.MAX_VALUE;
            for (int i = 0;i<resData.size();i++){
                int ii = resData.get(i);
                int x = indexs[2*ii];
                int y = indexs[2*ii + 1];
                double temp_value = value + Math.sqrt(Math.pow(x-preX,2)+Math.pow(y-preY,2));
                ArrayList<Integer> temp = new ArrayList<>();
//                temp = (ArrayList<Integer>)resData.clone();
                for (Integer iiiii :resData){
                    temp.add(iiiii);
                }
                temp.remove(i);
                int xxxx = deep(temp,indexs,temp_value,x,y);
                if (xxxx<min){
                    min = xxxx;
                }

            }
            return min;
        }


    }


}
