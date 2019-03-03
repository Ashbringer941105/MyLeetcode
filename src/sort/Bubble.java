package sort;

import java.util.List;

/**
 * @Author 宋宗垚
 * @Date 2019/3/3 10:29
 * @Description 冒泡排序，冒泡排序的复杂度为  n^2
 */
public class Bubble {
    /**
     * low版的冒泡排序，也可以称之为交换排序
     * @param list
     * @return
     */
    public static List<Integer> bubbleSort0(List<Integer> list){
        for (int i = 0;i<list.size();i++){
            for (int j = i+1;j<list.size();j++){
                if (list.get(i)>list.get(j)){
                    Main.swap(list,i,j);
                }
            }
        }
        return list;
    }

    /**
     * 正经的冒泡排序
     * @param list
     * @return
     */
    public static List<Integer> bubbleSort1(List<Integer> list){
        for (int i = 0;i<list.size() - 1;i++){
            for (int j = list.size() - 2;j>=i;j--){
                if (list.get(j)>list.get(j+1)){
                    Main.swap(list,j+1,j);
                }
            }
        }
        return list;
    }

    /**
     * 对于bubbleSort1的修正版本，如果已经有一大部分序列有序且在正确的位置上的时候，则只需要对其判断一次
     * 不需要多次判断和循环
     * @param list
     * @return
     */
    public static List<Integer> bubbleSort2(List<Integer> list){

        boolean flag = true;
        for (int i = 0;i<list.size() - 1;i++){
            flag = false;
            for (int j = list.size() - 2;j>=i;j--){
                if (list.get(j)>list.get(j+1)){
                    Main.swap(list,j+1,j);
                    flag = true;
                }
            }
        }
        return list;
    }

}
