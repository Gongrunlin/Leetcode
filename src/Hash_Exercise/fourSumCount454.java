package Hash_Exercise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class fourSumCount454 {
    public static void main(String[] args) {

    }
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int i1 = 0; i1 < nums2.length; i1++) {
                int sum = nums1[i] + nums2[i1];
                if (!map.containsKey(sum)){
                    map.put(sum,1);
                }
                else map.put(sum, map.get(sum)+1);
            }
        }

        for (int i = 0; i < nums3.length; i++) {
            for (int i1 = 0; i1 < nums4.length; i1++) {
                int sum = nums3[i]+nums4[i1];
                if (map.containsKey(0-sum)){
                    result += map.get(0-sum);
                }
            }
        }
        return result;
    }
}
