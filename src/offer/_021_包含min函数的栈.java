package offer;

import java.util.Stack;

/**
 * @Author 宋宗垚
 * @Date 2019/3/26 14:38
 * @Description TODO
 */
public class _021_包含min函数的栈 {
    Stack<Integer> data = new Stack<>();
    Stack<Integer> mindata = new Stack<>();
    public void push(int node) {
        data.push(node);
        if (mindata.empty()){
            mindata.push(node);
        }else {
            if (mindata.peek() > node){
                mindata.push(node);
            }else {
                mindata.push(mindata.peek());
            }
        }

    }

    public void pop() {
        data.pop();
        mindata.pop();
    }

    public int top() {
        return data.peek();
    }

    public int min() {
        return mindata.peek();
    }
}
