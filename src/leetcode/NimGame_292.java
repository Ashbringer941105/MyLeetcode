package leetcode;

/*
你和你的朋友，两个人一起玩 Nim游戏：桌子上有一堆石头，每次你们轮流拿掉 1 - 3 块石头。 拿掉最后一块石头的人就是获胜者。你作为先手。

你们是聪明人，每一步都是最优解。 编写一个函数，来判断你是否可以在给定石头数量的情况下赢得游戏。

示例:

输入: 4
输出: false
解释: 如果堆中有 4 块石头，那么你永远不会赢得比赛；
     因为无论你拿走 1 块、2 块 还是 3 块石头，最后一块石头总是会被你的朋友拿走。
 */
public class NimGame_292 {
    /*
    其实前面拿走几个无所谓，只需要关心123456的情况
    1：true
    2:true
    3:true
    4:false
    5:true
    6:true
    7:true
    8:false
    9:true
    10:true
     */
    public static void main(String[] args){
    boolean x = canWinNim(4);
    }
    public static boolean canWinNim(int n) {
        boolean flag = false;
       if(n<4){
           flag = true;
       }else  if(n%4!=0){
           flag = true;
       }
       return flag;
    }
}
