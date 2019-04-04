package offer;

/**
 * @Author 宋宗垚
 * @Date 2019/4/3 19:33
 * @Description TODO
 */
public class _024_二叉搜索树的后续遍历序列 {
    public static void main(String[] args){
        int[] xx = {4,8,6,12,16,14,10};
        VerifySquenceOfBST(xx);
    }
    public static boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null ){
            return false;
        }
        boolean flag = VSBST(sequence,0,sequence.length-1);
        return flag;
    }

    public static boolean VSBST(int [] sequence,int start,int end){
        if (start>=end){
            return true;
        }
        int root = sequence[end];
        int i = start;
        int mid = start;
        for (;i<end;i++){
            if (sequence[i]>root){
                mid = i;
                break;
            }
        }
        for (;i<=end;i++){
            if (sequence[i]<root){
                return false;
            }
        }
        boolean left =VSBST(sequence,start,mid-1);
        boolean right = VSBST(sequence,mid,end-1);
        return left && right;


    }
}
