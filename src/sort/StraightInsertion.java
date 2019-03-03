package sort;

import java.util.List;

/**
 * @Author 宋宗垚
 * @Date 2019/3/3 14:15
 * @Description 直接插入排序,时间复杂度为 n^2.但是他比冒泡排序和简单选择排序性能会好一些
 */
public class StraightInsertion {
    public static List<Integer> straightInsertionSort(List<Integer> list){
        for (int i = 1;i<list.size();i++){
            if (list.get(i)<list.get(i-1)){
                // 如果轮到的这个数比有序数列最左边的（也就是最大的）小，
                // 则在有序数列的右侧向左侧遍历，遇到比这个数大的就把这个数往右移一个
                // 遇到比这个数小的就把目标插在比他小的数的右侧
                boolean isMinest = true;
                int temp = list.get(i);
                for (int j = i-1;j>=0;j--){
                    if (list.get(j)>temp){
                        list.set(j+1,list.get(j));
                    }else {
                        list.set(j+1,temp);
                        isMinest = false;
                        break;
                    }
                }
                if (isMinest){
                    list.set(0,temp);
                }
            }
        }
        return list;
    }
}
