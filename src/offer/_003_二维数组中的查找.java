package offer;

/**
 * @Author 宋宗垚
 * @Date 2019/3/25 10:05
 * @Description TODO
 */
public class _003_二维数组中的查找 {
    public boolean Find(int target, int [][] array) {
        if (array==null){
            return false;
        }
//        if (array.length==1){
            return ff(target,array,0,array[0].length-1);
//        }
    }

    private boolean ff(int target,int [][] array,int i,int j){
        if (j<0 || i>array.length-1){
            return false;
        }
        if (array[i][j]==target){
            return true;
        }else if (array[i][j]<target){
            return ff(target,array,i+1,j);
        }else {
            // array[i][j]>target
            return ff(target,array,i,j-1);
        }
    }
}
