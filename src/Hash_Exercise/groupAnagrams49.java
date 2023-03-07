package Hash_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams49 {
    public static void main(String[] args) {

    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String str : strs) {
            //转成字符进行排序
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            //变回字符串格式
            String key = String.valueOf(ch);
            if (!map.containsKey(key)) map.put(key,new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList(map.values());
    }


}
