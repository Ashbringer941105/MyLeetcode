package leetcode.dynamic_programming;

/**
 * @Author 宋宗垚
 * @Date 2018/12/12 20:42
 * @Description 303. 区域和检索 - 数组不可变
 */
/*
给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。

示例：

给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()

sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3
说明:

你可以假设数组不可变。
会多次调用 sumRange 方法。
 */
public class RangeSumQueryImmutable_303 {
    //private ArrayList<Integer> data = new ArrayList<>();
    private int[] sum;
    public RangeSumQueryImmutable_303(int[] nums) {
        // for(int x:nums){
        //    this.data.add(x);
        // }
        sum = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
           if(i == 0){
               sum[i] = nums[0];
           }else {
               sum[i] = sum[i-1]+nums[i];
           }
        }
    }

    public int sumRange(int i, int j) {
//        int sum = 0;
//        for(int n = i;n<=j;n++){
//            sum = sum + xx[n];
//        }
//        return sum;
        return sum[j]-sum[i-1];
    }
}
