package StackAndQueue;

import java.util.Stack;

class MyQueue {
    Stack<Integer> stack1;//入队列使用
    Stack<Integer> stack2;//出队列使用
    public MyQueue() {
       stack1 = new Stack<>();
       stack2 = new Stack<>();
    }
    public void push(int x) {
       stack1.push(x);
    }
    public int pop() {
       satck1tostack2();
       return stack2.pop();
    }
    public int peek() {
        satck1tostack2();
        return stack2.peek();
    }
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
    private void satck1tostack2(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        else return;
    }
}
