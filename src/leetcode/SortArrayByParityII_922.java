package leetcode;

import java.util.ArrayList;

/*
给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
你可以返回任何满足上述条件的数组作为答案。

示例：

输入：[4,2,5,7]
输出：[4,5,2,7]
解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。

提示：
2 <= A.length <= 20000
A.length % 2 == 0
0 <= A[i] <= 1000
 */
public class SortArrayByParityII_922 {
    public static void main(String[] args){
        int[] a= {4,2,5,7};
    int[] xxx = sortArrayByParityII(a);
    }
    public static int[] sortArrayByParityII(int[] A) {
        ArrayList<Integer> oushu = new ArrayList<>();
        ArrayList<Integer> jishu = new ArrayList<>();
        for(int i:A) {
            if (i % 2 == 0) {
                oushu.add(i);
            } else {
                jishu.add(i);
            }
        }
        int[] result = new int[A.length];
        for(int i=0;i<result.length;i++){
            if(i%2==0){
                //oushu
                result[i] = oushu.get(i/2);
            }else {
                result[i] = jishu.get((i-1)/2);
            }
        }
        return result;

    }
}
