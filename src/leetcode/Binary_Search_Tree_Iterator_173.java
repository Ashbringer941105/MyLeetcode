package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 宋宗垚
 * @Date 2019/3/6 15:43
 * @Description 173. 二叉搜索树迭代器
 */
public class Binary_Search_Tree_Iterator_173 {
    private int index;
    private List<Integer> data;
    public Binary_Search_Tree_Iterator_173(TreeNode root) {
        this.data = new ArrayList<>();
        this.index = -1;
        zxbl(root);
        if (this.data.size() != 0){
            this.index=0;
        }


    }
    private void zxbl(TreeNode root){
        if (root==null || this.data==null){
            return ;
        }else {
            zxbl(root.left);
            this.data.add(root.val);
            zxbl(root.right);
        }
    }

    /** @return the next smallest number */
    public int next() {
        int result = this.data.get(this.index);
        this.index ++;
        return result;

    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if (this.index == -1 || this.index>=this.data.size()){
            return false;
        }else {
            return true;
        }
    }
}
