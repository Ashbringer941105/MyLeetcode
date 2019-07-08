package leetcode.dynamic_programming;

/**
 * @Author 宋宗垚
 * @Date 2018/12/15 21:50
 * @Description 64. 最小路径和
 */
/*
给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。

说明：每次只能向下或者向右移动一步。

示例:

输入:
[
  [1,3,1],
  [1,5,1],
  [4,2,1]
]
输出: 7
解释: 因为路径 1→3→1→1→1 的总和最小。
 */
public class MinimumPathSum_64 {
    public int minPathSum(int[][] grid) {
        if(grid.length==0){
            return 0;
        }
        if(grid[0].length==0){
            return 0;
        }
        int[][] data = new int[grid.length][grid[0].length];
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(i==0 && j==0){
                    // 第一行第一列
                    data[i][j] = grid[0][0];
                }else if (i==0 ) {
                    // 第一行 且不是最后一列
                    data[i][j] = data[i][j - 1] + grid[i][j];
                }else if(j==0){
                    data[i][j] = data[i - 1][j] + grid[i][j];
                }else {
                    data[i][j] = Math.min(data[i-1][j],data[i][j-1]) + grid[i][j];
                }
            }
        }
        return data[data.length-1][data.length-1];



    }

}
