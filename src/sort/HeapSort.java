package sort;

import java.util.concurrent.ConcurrentHashMap;

public class HeapSort {
    public static void main(String[] args){
        int[] arr = { 50, 10, 90, 30, 70, 40, 80, 60, 20 };
        System.out.println("排序之前：");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        for (int i = 0;i<arr.length;i++){
            heapSort(arr,arr.length-i);
            int temp = arr[0];
            arr[0] = arr[arr.length-1-i];
            arr[arr.length-1-i] =  temp;
        }
        System.out.println();
        System.out.println("排序之后：");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void heapSort(int[] arr,int size){
        for (int i = size-1;i>=0;i--){
            heapAdjust(arr,i,size);
        }
    }

    public static void heapAdjust(int[] arr,int currentNode,int size){
        if (currentNode<size){
            int left = currentNode*2+1;
            int right = currentNode*2+2;
            int max = currentNode;
            if (left<size){
                if (arr[left]>arr[max]){
                    max = left;
                }
            }
            if (right<size){
                if (arr[right]>arr[max]){
                    max = right;
                }
            }
            if (max!=currentNode){
                int temp = arr[max];
                arr[max] = arr[currentNode];
                arr[currentNode] = temp;
                heapAdjust(arr,max,size);
            }
        }
    }

}
