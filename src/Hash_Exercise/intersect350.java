package Hash_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class intersect350 {
    public static void main(String[] args) {

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length; i++) {
            if (nums1[i] < nums2[j]){
                i++;
            }
            else if (nums1[i] > nums2[j]){
                j++;
            }else{
                list.add(nums2[j]);
                i++;
                j++;
            }
        }
        int[] result = new int[list.size()];
        int i = 0;
        for (Integer integer : list) {
            result[i++] = integer;
        }
        return result;
    }
}
