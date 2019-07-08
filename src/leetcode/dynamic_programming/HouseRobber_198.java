package leetcode.dynamic_programming;

/**
 * @Author 宋宗垚
 * @Date 2018/12/13 21:45
 * @Description 198. 打家劫舍
 */
/*
你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。

给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。

示例 1:

输入: [1,2,3,1]
输出: 4
解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
     偷窃到的最高金额 = 1 + 3 = 4 。
示例 2:

输入: [2,7,9,3,1]
输出: 12
解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
     偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 */
public class HouseRobber_198 {
    public static void main(String[] args){
        int[] x = {1,2,3,1};
        rob(x);
    }
    public static int rob(int[] nums) {
        int[] data = new int[nums.length];
        int max = 0;
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        if(nums.length==3){
           return Math.max(nums[2]+nums[0],nums[1]);
        }
        if(nums.length>3){
            data[0] = nums[0];
            data[1] = Math.max(nums[0],nums[1]);
            data[2] = Math.max(nums[2]+nums[0],nums[1]);
            for(int i = 3;i<nums.length;i++){
                data[i] = Math.max(data[i-2],data[i-3]) + nums[i];
            }
        }


        return Math.max(data[data.length-1],data[data.length-2]);
    }
}
