package String_Exercise;

public class strStr28 {
    public static void main(String[] args) {


    }
    public int strStr(String haystack, String needle) {
        if (needle == "") return 0;
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            String sub = haystack.substring(i,needle.length()+i);
            if (sub.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
