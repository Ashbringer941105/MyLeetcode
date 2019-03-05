import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author 宋宗垚
 * @Date 2018/11/13 20:31
 * @Description TODO
 */
/*
将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。

本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。

示例:

给定有序数组: [-10,-3,0,5,9],

一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：

      0
     / \
   -3   9
   /   /
 -10  5
 */
public class ConvertSortedArraytoBinarySearchTree_108 {
//    public TreeNode sortedArrayToBST(int[] nums) {
//        TreeNode tn = null;
//        if(nums==null||nums.length==0){
//            return null;
//        }else {
//            tn  = getTree(nums,0,nums.length-1);
//        }
//        return tn;
//    }
//
//    /**
//     *
//     * @param nums 数组
//     * @param l 数组中需要构造成树的左起点
//     * @param r 数组中需要构造成树的右终点
//     * @return
//     */
//    public TreeNode getTree(int[] nums,int l,int r){
//        if(l<=r){
//            // 如果左起点小于右终点，则可以构造成树
//            int middle = (l+r)/2;
//            TreeNode tn = new TreeNode(nums[middle]);
//            tn.left = getTree(nums,l,middle-1);
//            tn.right = getTree(nums,middle+1,r);
//            return tn;
//        }else {
//            return null;
//        }
//    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length==0){
            return null;
        }else {
            int index = nums.length/2;
            TreeNode tn = new TreeNode(nums[index]);
            tn.left = sortedArrayToBST(Arrays.copyOfRange(nums,0,index));
            tn.right = sortedArrayToBST(Arrays.copyOfRange(nums,index+1,nums.length));
            return tn;
        }
    }


}
