package String_Exercise;

import java.util.ArrayList;
import java.util.List;

public class reverseString541 {
    public static void main(String[] args) {

    }
    public String reverseStr(String s, int k) {
        int len = s.length();
        char a[] = s.toCharArray();
        for (int i = 0; i < len;) {
            if (i + k < len){
                reverseString(a, i,i + k -1);
            }else {
                reverseString(a, i, len - 1);
            }
            i += 2 * k;
        }
        return new String(a);
    }
    public static void reverseString(char[] s , int star , int end) {
        for (int i = star, j = end ; i < j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
