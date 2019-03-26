package offer;

import java.util.ArrayList;

/**
 * @Author 宋宗垚
 * @Date 2019/3/26 11:00
 * @Description TODO
 */
public class _014_调整数组顺序使奇数位于偶数前面 {
    public void reOrderArray(int [] array) {
        if (array.length==0){
            return;
        }
        ArrayList<Integer> jishu = new ArrayList<>();
        ArrayList<Integer> oushu = new ArrayList<>();
        for (Integer i : array){
            if (i%2==0){
                oushu.add(i);
            }else {
                jishu.add(i);
            }
        }
        int[] result = new int[jishu.size()+oushu.size()];
        for (int i=0;i<jishu.size()+oushu.size();i++){
            if (i<jishu.size()){
                result[i] = jishu.get(i);
            }else {
                result[i] = oushu.get(i-jishu.size());
            }
        }
    }
}
