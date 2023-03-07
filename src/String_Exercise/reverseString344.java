package String_Exercise;

public class reverseString344 {
    public static void main(String[] args) {

    }
    public static void reverseString(char[] s) {
        int len = s.length;
        for (int i = 0, j = s.length - 1; i < len/2; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
