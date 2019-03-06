import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sum_Root_to_Leaf_Numbers_129 {
    public int sumNumbers(TreeNode root) {
        if (root==null){
            return 0;
        }else {
            List<Integer> data = new ArrayList<>();
            data.add(0);
            ff(root,"",data);
            return data.get(0);
           // return Collections.
        }

    }
    public void ff(TreeNode root,String str,List<Integer> data){
        if (root.left==null && root.right == null){
            str = str + root.val;
            int x = Integer.parseInt(str);
            data.set(0,data.get(0)+x);
        }else if (root.left==null){

            ff(root.right,str+ root.val,data);
        }else if (root.right==null){
            ff(root.left,str+root.val,data);
        }else {
            ff(root.left,str+root.val,data);
            ff(root.right,str+ root.val,data);
        }

    }

}
