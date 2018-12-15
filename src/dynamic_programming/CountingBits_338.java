package dynamic_programming;

/**
 * @Author 宋宗垚
 * @Date 2018/12/15 19:52
 * @Description 338. 比特位计数
 */
/*
给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。

示例 1:

输入: 2
输出: [0,1,1]
示例 2:

输入: 5
输出: [0,1,1,2,1,2]
进阶:

给出时间复杂度为O(n*sizeof(integer))的解答非常容易。但你可以在线性时间O(n)内用一趟扫描做到吗？
要求算法的空间复杂度为O(n)。
你能进一步完善解法吗？要求在C++或任何其他语言中不使用任何内置函数（如 C++ 中的 __builtin_popcount）来执行此操作
 */
public class CountingBits_338 {
    public static void main(String[] args){
        countBits(64);
    }
    public static int[] countBits(int num) {
        int[] data = new int[num+1];
        int x = 0;// 当前比i小的最大的2的n次方是2的几次方
        for(int i = 0;i<data.length;i++){
            if(i==0){
                data[i] = 0;
            }else if(i==1){
                data[i] = 1;
            }else {

//                int x = (int)Math.sqrt(i);
                String temp = Integer.toBinaryString(i);
                if((i&(i-1))==0){
                    //这个数是2的n次方
                    x = temp.length()-1;
                }
                int res =  (int)(i - Math.pow(2,x));
                if(res==0){
                    data[i]=1;
                }else {
                    data[i] = 1 + data[res];
                }

            }


        }
        return data;
    }
}
