package dynamic_programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @Author 宋宗垚
 * @Date 2018/12/18 13:21
 * @Description 343. 整数拆分
 */
/*
给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。

示例 1:

输入: 2
输出: 1
解释: 2 = 1 + 1, 1 × 1 = 1。
示例 2:

输入: 10
输出: 36
解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36。
说明: 你可以假设 n 不小于 2 且不大于 58。
 */

public class IntegerBreak_343 implements A {


    public static void main(String[] args)  {

//

    }


    public  int integerBreak(int n) {


        int[] data = new int[n];
        data[0] = 1;
        data[1] = 1;

        for(int i =2;i<n;i++){

                int max = 0;
                for(int j = 0;j<i/2+1;j++){
                    int temp = data[j] * data[i-j-1];
                    if(temp>max){
                        max = temp;
                    }

                }
                if(i>max){
                    max = i;
                }
                data[i] = max;

        }
        return data[n-1];
    }


}
