package offer;

/**
 * @Author 宋宗垚
 * @Date 2019/3/25 22:31
 * @Description 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class _009_矩阵覆盖 {
    public int RectCover(int target) {
        if (target==0){
            return 0;
        }
        else if (target==1){
            return 1;
        }else if (target==2){
            return 2;
        }else {
            int[] data = new int[target];
            data[0] = 1;
            data[1] = 2;
            for (int i =2 ;i<target;i++){
                data[i] = data[i-1] + data[i-2];
            }
            return data[target-1];
        }
    }
}
