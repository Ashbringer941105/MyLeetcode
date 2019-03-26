package offer;

/**
 * @Author 宋宗垚
 * @Date 2019/3/25 21:58
 * @Description TODO
 */
public class _008_旋转数组的最小数字 {
    public static void main(String[] args){
        int [] dd = {3,4,5,1,2};
        minNumberInRotateArray(dd);
    }
    public static int minNumberInRotateArray(int [] array) {
        int i = 0;
        int j = array.length-1;
        int mid = i;
        while (array[i]>array[j]){
            if (j-i==1){
                mid = j;
                break;
            }
            mid = (i+j)/2;
            if (array[mid]>=array[i]){
                i = mid;
            }else if (array[mid] <= array[j]){
                j = mid;
            }
        }
        return array[mid];
    }
}
