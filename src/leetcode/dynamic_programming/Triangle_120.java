package leetcode.dynamic_programming;

import java.util.List;

/**
 * @Author 宋宗垚
 * @Date 2018/12/18 9:10
 * @Description 120. 三角形最小路径和
 */
/*
给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。

例如，给定三角形：

[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。

说明：

如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。
 */
public class Triangle_120 {
    public int minimumTotal(List<List<Integer>> triangle) {

        if(triangle.size()==0){
            return 0;
        }else if(triangle.size()==1){

            return triangle.get(0).get(0);
        }else {
            int[][] data = new int[triangle.size()][triangle.size()];
            data[0][0] = triangle.get(0).get(0);
            for(int i = 1;i<triangle.size();i++){
                for(int j = 0;j<triangle.get(i).size();j++){
                    if(j==0){
                        data[i][j] = data[i-1][j]+ triangle.get(i).get(j);
                    }else if(j==triangle.get(i).size()-1){
                        data[i][j] = data[i-1][j-1]+triangle.get(i).get(j);
                    }else {
                        data[i][j] = Math.min(data[i-1][j],data[i-1][j-1])+triangle.get(i).get(j);
                    }
                }

            }
            int min = Integer.MAX_VALUE;
            for(int i = 0;i<triangle.size();i++){
                if(data[triangle.size()-1][i]<min){
                    min = data[triangle.size()-1][i];
                }
            }
            return min;

        }



    }

}
