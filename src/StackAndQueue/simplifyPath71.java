package StackAndQueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class simplifyPath71 {
    public static void main(String[] args) {
        
    }
    public String simplifyPath(String path) {
        String[] ws = path.split("/");
        StringBuilder ans = new StringBuilder();
        Deque<String> q = new LinkedList();
        for (String w: ws) {
            if ("..".equals(w)) {
                if (!q.isEmpty()) q.pop();
            } else if (w.length() > 0 && !".".equals(w)) {
                q.push(w);
            }
        }
        if (q.isEmpty()) {
            ans.append("/");
        } else {
            while (!q.isEmpty()) {
                ans.append("/");
                ans.append(q.pollLast());
            }
        }
        return ans.toString();
    }
}
