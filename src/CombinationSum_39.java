import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
candidates 中的数字可以无限制重复被选取。
说明：
所有数字（包括 target）都是正整数。
解集不能包含重复的组合。
示例 1:
输入: candidates = [2,3,6,7], target = 7,
所求解集为:
[
  [7],
  [2,2,3]
]
示例 2:
输入: candidates = [2,3,5], target = 8,
所求解集为:
[
  [2,2,2,2],
  [2,3,3],
  [3,5]
]
 */
public class CombinationSum_39 {

public static void main(String[] args){
    int[] in = {2,3,6,7};
    int tar = 7;
    List<List<Integer>> x = combinationSum(in,tar);
    int y = 0;
}

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int j = 0;
        if(candidates.length==0){
            return result;
        }
        for(int i :candidates){
            int sum = 0;
            List<Integer> x = new ArrayList<>();
            x = dfs(candidates,target,j,sum,x);
            if(x!= null){
                result.add(x);
            }
        }
    return result;



    }
    public static List<Integer> dfs(int[] a,int target,int j,int sum,List<Integer> list){
        if(list.size()==a.length || list==null){
            // 达到最大深度
            return null;
        }else{
            for(int i:a){
                if(list.contains(i)){
                   continue;
                }
                sum = sum + i;
                if(sum == target){
                    list.add(i);
                    return list;
                }else if(sum <target){
                    list.add(i);
                    list = dfs(a,target,j,sum,list);
                }else if (sum > target){
                return null;}


            }
        }
        return list;
    }
}
