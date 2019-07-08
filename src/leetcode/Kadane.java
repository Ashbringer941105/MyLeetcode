package leetcode;

/**
 * @Author 宋宗垚
 * @Date 2018/11/27 10:53
 * @Description 计算出数串中最大子串的和
 */
public class Kadane {

    public static void main(String[] args){
        int[] A = {-2, 1,-3, 4, -1, 2, 1, -5, 4};
        System.out.println(Kadane(A));
    }



    public static int Kadane(int[] A){
        int max_current =0;// Integer.MIN_VALUE;
        int max_all =0;// Integer.MIN_VALUE;
        for(int i:A){
            max_current = Math.max(0,max_current + i);
            max_all = Math.max(max_current,max_all);
        }
        return max_all;
    }
}
