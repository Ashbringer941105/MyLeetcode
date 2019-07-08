package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 宋宗垚
 * @Date 2018/11/14 10:49
 * @Description TODO
 */
/*
给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 */
public class PascalsTriangle_118 {
    public static void main(String[] args) {
        List<List<Integer>> x = generate(10);
        int a =1;
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0;j<i+1;j++){
               if(j==0 || j==i){
                   row.add(1);
               }else {
                   List<Integer> upRow = result.get(i-1);
                   row.add(upRow.get(j)+upRow.get(j-1));
               }
            }

            result.add(row);

        }
    return result;
    }
}
