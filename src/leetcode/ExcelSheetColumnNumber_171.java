package leetcode;

/*
给定一个Excel表格中的列名称，返回其相应的列序号。

例如，

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28
    ...
示例 1:

输入: "A"
输出: 1
示例 2:

输入: "AB"
输出: 28
示例 3:

输入: "ZY"
输出: 701
 */
public class ExcelSheetColumnNumber_171 {
    public static void main(String[] args){
        int x = titleToNumber("AA");
        System.out.println(x);
    }
    public static int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = 0;i<chars.length;i++){
            int temp = (int)(chars[i]-64) * (int)Math.pow(26,chars.length-i-1);
            result += temp;
        }
        return result;
    }
}
