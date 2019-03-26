package offer;

/**
 * @Author 宋宗垚
 * @Date 2019/3/25 22:19
 * @Description TODO
 */
public class _009_跳台阶 {
    public int JumpFloor(int target) {
        if (target==1){
            return 1;
        }else if (target==2){
            return 2;
        }else {
            int[] data = new int[target];
            data[0] = 1;
            data[1] = 2;
            for (int i = 2;i<target;i++){
                data[i] = data[i-1] + data[i-2];
            }
            return data[target-1];
        }
    }
}
