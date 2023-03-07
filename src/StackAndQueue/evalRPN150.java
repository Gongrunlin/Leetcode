package StackAndQueue;

import java.util.Stack;

public class evalRPN150 {
    public static void main(String[] args) {
        String[] s = {"4","13","5","/","+"};
        System.out.println(evalRPN(s));
    }

    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            switch (tokens[i]){
                case "+":
                    stack.push(String.valueOf(Integer.valueOf(stack.pop())+Integer.valueOf(stack.pop())));
                    break;
                case "-":
                    int a = Integer.valueOf(stack.pop());
                    int b = Integer.valueOf(stack.pop());

                    stack.push(String.valueOf(b - a));
                    break;
                case "*":
                    stack.push(String.valueOf(Integer.valueOf(stack.pop())*Integer.valueOf(stack.pop())));
                    break;
                case "/":
                    int c = Integer.valueOf(stack.pop());
                    int d = Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(d/c));
                    break;
                default:
                    stack.push(tokens[i]);
            }
        }
        return Integer.valueOf(stack.pop());
    }

}
