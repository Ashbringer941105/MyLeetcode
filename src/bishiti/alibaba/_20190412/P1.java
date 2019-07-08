package bishiti.alibaba._20190412;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 */
public class P1 {
public static void main(String[] args){
    Scanner s1 = new Scanner(System.in);
    List<Double> data = new ArrayList<>();
    int n = (int)s1.nextDouble();
    for (int i=0;i<n;i++){
        double in = s1.nextDouble();
        data.add(in);
    }
    List<Double> gailv = new ArrayList<>();
    double result = 0.0d;
    for (int i =0;i<n;i++){
        if (i==0){
            gailv.add(data.get(i));
            result += gailv.get(i);
        }else {
//           计算上一次另一个人取过之后没有赢的概率 乘上他这次取可以赢的概率
            double xx = (1-gailv.get(i-1)) * data.get(i);
            gailv.add(xx);
            if (i%2==0){
                result += gailv.get(i);
            }
        }
    }
    DecimalFormat df = new DecimalFormat( "0.0000 ");
    System.out.println(df.format(result));
}
}
