package dynamic_programming;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 宋宗垚
 * @Date 2019/3/13 15:08
 * @Description 303. 区域和检索 - 数组不可变
 */
public class Range_Sum_Query_Immutable_303 {
    private int[] data;

    public Range_Sum_Query_Immutable_303(int[] nums) {
        data = new int[nums.length];
        for (int i = 0;i<nums.length;i++){
          if (i==0){
              data[i] = nums[i];
          }else {
              data[i] = data[i-1] + nums[i];
          }

        }

    }
    public int sumRange(int i, int j) {
        if (i==0){
            return this.data[j];
        }else {
            return this.data[j] - this.data[i-1];
        }
    }

}
