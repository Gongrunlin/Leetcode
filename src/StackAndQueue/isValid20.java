package StackAndQueue;

import java.util.Stack;

public class isValid20 {
    public static void main(String[] args) {
        String s = "]";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        char[] a = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == '{'){
                stack.push('{');
            }
            else if (a[i] == '}'){
                if (stack.isEmpty()) return false;
                char pop = stack.pop();
                if (pop != '{'){
                    return false;
                }
            }
            if (a[i] == '['){
                stack.push('[');
            }
            else if (a[i] == ']'){
                if (stack.isEmpty()) return false;
                char pop = stack.pop();
                if (pop != '['){
                    return false;
                }
            }
            if (a[i] == '('){
                stack.push('(');
            }
            else if (a[i] == ')'){
                if (stack.isEmpty()) return false;
                char pop = stack.pop();
                if (pop != '('){
                    return false;
                }
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }
}
