/**
 * @Author 宋宗垚
 * @Date 2018/11/27 11:21
 * @Description TODO
 */
/*
求解一个给定的方程，将x以字符串"x=#value"的形式返回。该方程仅包含'+'，' - '操作，变量 x 和其对应系数。

如果方程没有解，请返回“No solution”。

如果方程有无限解，则返回“Infinite solutions”。

如果方程中只有一个解，要保证返回值 x 是一个整数。

示例 1：

输入: "x+5-3+x=6+x-2"
输出: "x=2"
示例 2:

输入: "x=x"
输出: "Infinite solutions"
示例 3:

输入: "2x=x"
输出: "x=0"
示例 4:

输入: "2x+3x-6x=x+2"
输出: "x=-1"
示例 5:

输入: "x=x+2"
输出: "No solution"
 */
public class SolvetheEquation_640 {
    public static void main(String[] args){
        String tt = "x+5-3+x=6+x-2";
        solveEquation(tt);
    }
    public static String solveEquation(String equation) {
        String result = "";
        String left = equation.split("=")[0];
        String right = equation.split("=")[1];
       // String[] lefts = left.split()

        return result;
    }
}
