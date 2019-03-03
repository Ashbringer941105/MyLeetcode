package sort;

import java.util.List;

/**
 * @Author 宋宗垚
 * @Date 2019/3/3 11:15
 * @Description 简单选择排序
 */
public class SampleSelection {

    public static List<Integer> sampleSelectionSort0(List<Integer> list){

        for (int i = 0;i<list.size();i++){
            int indexOfMin = i;
            int min = list.get(i);
            for (int j = i;j<list.size();j++){
                if (list.get(j)<min){
                    indexOfMin = j;
                    min = list.get(j);
                }
            }
            if (indexOfMin != i){
                Main.swap(list,i,indexOfMin);
            }
        }
        return list;
    }
}
