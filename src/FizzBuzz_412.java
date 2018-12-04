import java.util.ArrayList;
import java.util.List;

/**
 * @Author 宋宗垚
 * @Date 2018/11/15 13:01
 * @Description TODO
 */
/*

 */
public class FizzBuzz_412 {

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String temp = "";
            if(i%15==0){
                temp = "FizzBuzz";
            }else if(i%3==0 && i%5!=0){
                temp = "Fizz";
            }else if(i%5==0 && i%3!=0){
                temp = "Buzz";
            }else {
                temp = String.valueOf(i);
            }
            result.add(temp);
        }

       return result;

    }
}
