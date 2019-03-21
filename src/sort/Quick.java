package sort;

import java.util.ArrayList;
import java.util.List;

public class Quick {

    public static List<Integer> QuickSort(List<Integer> L){
        QSort(L,0,L.size()-1);
        return L;

    }
    public static void QSort(List<Integer> list,int low ,int high){
        int pivot;
        if (low<high){
            pivot = Partition(list,low,high);
            QSort(list,low,pivot);
            QSort(list,pivot+1,high);
        }
    }
    public static int Partition(List<Integer> list,int low,int high){
        int pivotkey = list.get(low);
        while (low<high){
            while (low<high && list.get(high)<=pivotkey){
                high--;
            }
            swap(list,low,high);
            while (low<high && list.get(low)<=pivotkey){
                low++;
            }
            swap(list,low,high);
        }
        return low;
    }

    public static void swap(List<Integer> list,int low ,int high){
        int temp = list.get(low);
        list.set(low,list.get(high));
        list.set(high,temp);
    }
}
