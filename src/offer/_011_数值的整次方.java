package offer;

/**
 * @Author 宋宗垚
 * @Date 2019/3/26 10:19
 * @Description TODO
 */
public class _011_数值的整次方 {
    public static void main(String[] args){
        Power(2,3);
    }
    public static double Power(double base, int exponent) {
        double current = base;
        double res = 1.0;
        int n = 0;
        if (exponent>0){
            n = exponent;
        }else if (exponent<0){
            n = -exponent;
        }else {
            // n==0
            //throw new RuntimeException("指数不能为0");
            double re = 1;
            return re;
        }
        while (n!=0){
            if ((n&1)==1){
                res = res * current;
            }
            current = current * current;
            n = n>>1;
        }
        return exponent>=0? res :(1/res);


    }
}
