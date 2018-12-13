package dynamic_programming;

/**
 * @Author 宋宗垚
 * @Date 2018/12/12 21:10
 * @Description 121. 买卖股票的最佳时机
 */
/*
给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。

如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。

注意你不能在买入股票前卖出股票。

示例 1:

输入: [7,1,5,3,6,4]
输出: 5
解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
示例 2:

输入: [7,6,4,3,1]
输出: 0
解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 */
public class BestTimetoBuyandSellStock_121 {
    public static void main(String[] args){
        int[] x = {7,1,5,3,6,4};
        maxProfit(x);
    }
    public static int maxProfit(int[] prices) {
        int[] gain = new int[prices.length];
        int[] mm = new int[prices.length];
        int max = Integer.MIN_VALUE;
        for(int i = prices.length-1;i>=0;i--){
            if(i==prices.length-1){
                mm[i] = prices[i];
            }else {
                mm[i] = Math.max(prices[i],mm[i+1]);
            }
            gain[i] =  mm[i] - prices[i];
            if(gain[i]>max){
                max = gain[i];
            }
        }
        return Math.max(0,max);


    }
}
