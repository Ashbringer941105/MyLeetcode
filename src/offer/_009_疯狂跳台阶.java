package offer;

/**
 * @Author 宋宗垚
 * @Date 2019/3/25 22:23
 * @Description 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class _009_疯狂跳台阶 {
    public int JumpFloorII(int target) {
        int[] data = new int[target];
        data[0] = 1;
        for (int i = 1;i<target;i++){
            int sum = 0;
            for (int j = 0;j<i;j++){
                sum = sum + data[j];
            }
            data[i] = sum + 1;
        }
        return data[target-1];
    }
}
