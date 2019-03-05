package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author 宋宗垚
 * @Date 2019/3/3 10:21
 * @Description TODO
 */
public class Main {
    public static void swap(List<Integer> list,int i,int j){
        int temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }
    public static void p(List<Integer> list){
        for (Integer i :list){
            System.out.println(i);
        }
    }
    public static void main(String args[]){
//        List<Integer> data = new ArrayList<>();
//        data.add(14);
//        data.add(1);
//        data.add(22);
//        data.add(3);
//        data.add(7);
//        data.add(5);
//        data.add(10);
//        List<Integer> result = StraightInsertion.straightInsertionSort(data);
//        p(result);
        int[] x = {-10,-3,0,5,9};
        int[] b = Arrays.copyOfRange(x,x.length/2+1,x.length);
        int xx = 10;
    }

}
