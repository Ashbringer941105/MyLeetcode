package leetcode;

import java.util.ArrayList;

/*
给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。
你可以返回满足此条件的任何数组作为答案。
示例：
输入：[3,1,2,4]
输出：[2,4,3,1]
输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
提示：
1 <= A.length <= 5000
0 <= A[i] <= 5000
 */
public class SortArrayByParity_905 {
    public int[] sortArrayByParity(int[] A) {
        ArrayList<Integer> oushu = new ArrayList<>();
        ArrayList<Integer> jishu = new ArrayList<>();
        for(int i:A){
            if(i%2==0){
                oushu.add(i);
            }
            else
            {
                jishu.add(i);
            }
        }
        oushu.addAll(jishu);
        int[] result = new int[oushu.size()];
        for(int i=0;i<oushu.size();i++){
            result[i] = oushu.get(i);
        }
        return result;
    }
}
