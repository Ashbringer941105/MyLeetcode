package offer;

/**
 * @Author 宋宗垚
 * @Date 2019/3/26 9:57
 * @Description TODO
 */
public class _010_二进制中1的个数 {
    public int NumberOf1(int n) {
        int count = 0;
        while (n!=0){
            ++count;
            n = (n-1) & n;
        }
        return count;
    }
}
