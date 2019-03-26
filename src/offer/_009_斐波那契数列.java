package offer;

/**
 * @Author 宋宗垚
 * @Date 2019/3/25 22:14
 * @Description TODO
 */
public class _009_斐波那契数列 {
    public int Fibonacci(int n) {
        if(n==0){
            return 0;
        }else if (n==1){
            return 1;
        }else{
            int[] data = new int[n];
            data[0] = 1;
            data[1] = 1;
            for (int i = 2;i<n;i++){
                data[i] = data[i-1] + data[i-2];
            }
            return data[n-1];
        }

    }
}
