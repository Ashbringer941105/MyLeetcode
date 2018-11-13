import java.util.ArrayList;
import java.util.List;

/*
自除数 是指可以被它包含的每一位数除尽的数。

例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。

还有，自除数不允许包含 0 。

给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。

示例 1：

输入：
上边界left = 1, 下边界right = 22
输出： [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
注意：

每个输入参数的边界满足 1 <= left <= right <= 10000。
 */
public class SelfDividingNumbers_728 {
    public static void main(String[] args){
        List<Integer> x = selfDividingNumbers(21,21);
        int c  = 0;
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for(int i = left;i<right+1;i++){
            if(isDivided(i)){
                result.add(i);
            }
        }
        return result;
    }
    public static boolean isDivided(int x){
        boolean flag = true;
        int y = x;
        ArrayList<Integer> numberlist = new ArrayList<>();
        while (true){
            int temp = x%10;
            numberlist.add(temp);
            x = x/10;
            if(x==0) {
                break;
            }
        }
        for(int i =0;i<numberlist.size();i++){
            if(numberlist.get(i)==0 || y%numberlist.get(i)!=0){
                flag = false;
                break;
            }
        }

        return flag;

    }
}
