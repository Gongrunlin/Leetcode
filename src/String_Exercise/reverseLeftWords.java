package String_Exercise;

public class reverseLeftWords {
    public static void main(String[] args) {
        String s = "123456";
        System.out.println(reverseLeftWords(s, 2));
    }
    public static String reverseLeftWords(String s, int n) {
        char[] s1 = s.toCharArray();
        reverseString(s1,0,n-1);
        reverseString(s1,n,s1.length-1);
        reverseString(s1,0,s1.length-1);
        return new String(s1);

    }
    public static void reverseString(char[] s , int star , int end) {
        for (int i = star, j = end ; i < j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }


}

//class Solution {
//    public String reverseLeftWords(String s, int n) {
//        return s.substring(n, s.length()) + s.substring(0, n);
//    }
//}