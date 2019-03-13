package dynamic_programming;

/**
 * @Author 宋宗垚
 * @Date 2018/12/12 21:31
 * @Description 70. 爬楼梯
 */
/*
假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

注意：给定 n 是一个正整数。

示例 1：

输入： 2
输出： 2
解释： 有两种方法可以爬到楼顶。
1.  1 阶 + 1 阶
2.  2 阶
示例 2：

输入： 3
输出： 3
解释： 有三种方法可以爬到楼顶。
1.  1 阶 + 1 阶 + 1 阶
2.  1 阶 + 2 阶
3.  2 阶 + 1 阶
 */
public class ClimbingStairs_70 {
    public static void main(String[] args){
        int x = climbStairs(2);
    }
//    public static int climbStairs(int n) {
//        int result = 0;
//        int[] data = new int[n];
//        for(int i = 0;i<data.length;i++){
//            if(i==0) {
//                data[i] = 1;
//            }else if(i==1){
//                data[i] = 2;
//            }else {
//                data[i] = data[i-1]+data[i-2];
//            }
//
//        }
//        return data[n-1];
//    }
    public static int climbStairs(int n) {
        int[] data = new int[n];
        for (int i =0;i<n;i++){
            if (i==0){
                // 如果只有一节台阶
                data[i] = 1;
            }else if (i==1){
                // 如果有两节台阶
                data[i] = 2;
            }else {
                // 如果有三节或者三节以上的台阶，则可以从前一节台阶跳一个上来，也可以从前前一个跳俩上来
                data[i] = data[i-1] + data[i-2];
            }
        }
        return data[n-1];
    }
}
