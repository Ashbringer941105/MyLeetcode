package offer;

import java.util.Stack;

/**
 * @Author 宋宗垚
 * @Date 2019/3/25 21:37
 * @Description TODO
 */
public class _007_两个栈实现队列 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        while (!stack1.empty()){
            stack2.push(stack1.pop());
        }
        stack2.push(node);
    }

    public int pop() {
        while (!stack2.empty()){
            stack1.push(stack2.pop());
        }
        int result = stack1.pop();
        return result;
    }
}
