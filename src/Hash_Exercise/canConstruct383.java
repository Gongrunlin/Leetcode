package Hash_Exercise;

import java.util.ArrayList;
import java.util.Collection;

public class canConstruct383 {
    public static void main(String[] args) {

    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] record1 = new int[26];
        int[] record2 = new int[26];
        for (char c : ransomNote.toCharArray()) {
            record1[c - 'a'] += 1;
        }
        for (char c : magazine.toCharArray()) {
            record2[c - 'a'] +=1 ;
        }
        for (int i = 0; i < 26; i++) {
            if (record1[i] - record2[i] < 0) return false;
        }
        return true;
    }
}
