package dynamic_programming;

/**
 * @Author 宋宗垚
 * @Date 2018/12/12 21:47
 * @Description 53. 最大子序和
 */
/*
给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

示例:

输入: [-2,1,-3,4,-1,2,1,-5,4],
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
进阶:

如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 */
public class MaximumSubarray_53 {
//    public int maxSubArray(int[] nums) {
//        int max_current = 0;
//        int max_all = 0;
//        int max_value = Integer.MIN_VALUE;
//        for(int x :nums){
//            max_value = Math.max(max_value,x);
//            max_current = Math.max(0,max_current+x);
//            max_all = Math.max(max_all,max_current);
//        }
//        if(max_value<=0){
//            return max_value;
//        }else {
//            return max_all;
//        }
//
//    }
    public int maxSubArray(int[] nums) {
        int[] data = new int[nums.length];
        int max = Integer.MIN_VALUE;
        int max_data = Integer.MIN_VALUE;
        for (int i = 0;i<nums.length;i++){
            if (i==0){
                data[i] = Math.max(0,nums[i]);
                max = Math.max(max,data[i]);
            }else {
                data[i] = Math.max(data[i-1] + nums[i],0);
                max = Math.max(max,data[i]);
            }
            max_data = Math.max(max_data,nums[i]);
        }
        if (max>0){
            return max;
        }else {
            return max_data;
        }

    }
}
