package offer;

import java.util.Stack;

/**
 * @Author 宋宗垚
 * @Date 2019/3/26 14:52
 * @Description TODO
 */
public class _022_栈的压入弹出序列 {

    public static void main(String[] args){
        int [] pushA = {1,2,3,4,5};
        int [] popA = {4,5,3,2,1};
        System.out.println(IsPopOrder(pushA,popA));
    }
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> data = new Stack<>();

        int indexOfPop = 0;
        int indexOfPush = 0;
        while (true){
            if (data.empty()){
                if (indexOfPush==pushA.length){
                    break;
                }
                data.push(pushA[indexOfPush]);
                ++indexOfPush;
            }else {
                if (data.peek().equals(popA[indexOfPop])){
                    data.pop();
                    ++indexOfPop;
                }else {
                    if (indexOfPush == pushA.length){
                        break;
                    }
                    data.push(pushA[indexOfPush]);
                    ++indexOfPush;
                }
            }

        }
        if (data.empty()){
            return true;
        }else {
            return false;
        }
    }
}
