package leetcode;

/**
 * @Author 宋宗垚
 * @Date 2018/11/14 10:02
 * @Description TODO
 */
/*
给定一个正整数，检查他是否为交替位二进制数：换句话说，就是他的二进制数相邻的两个位数永不相等。

示例 1:

输入: 5
输出: True
解释:
5的二进制数是: 101
示例 2:

输入: 7
输出: False
解释:
7的二进制数是: 111
示例 3:

输入: 11
输出: False
解释:
11的二进制数是: 1011
 示例 4:

输入: 10
输出: True
解释:
10的二进制数是: 1010
 */
public class BinaryNumberwithAlternatingBits_693 {
    public static void main(String[] args){
        boolean x = hasAlternatingBits(3);
    }
    public static boolean hasAlternatingBits(int n) {
        boolean flag = true;
        char[] x = Integer.toBinaryString(n).toCharArray();
//        if(n==3 && false){
//            flag=false;
//        }else {
            for(int i = 0;i<x.length-1;i++){
                if(x[i]==x[i+1]){
                    flag = false;
                    break;
                }
            }
//        }

        return flag;
    }
}
