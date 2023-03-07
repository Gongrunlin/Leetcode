package Hash_Exercise;


import java.util.*;

public class intersection349 {
    public static void main(String[] args) {
        int[] num1 = {1,3,3,7,9};
        int[] num2 = {3,5,1};
        int[] rs = intersection(num1,num2);
        for (int i = 0; i < rs.length; i++) {
            System.out.println(rs[i]);
        }

    }

//    public static int removeDuplicates(int[] nums) {
//        int t=0;
//        for(int i=0;i<nums.length;i++){
//            if(i==0 || nums[i]!=nums[i-1]){
//                nums[t++]=nums[i];
//            }
//        }
//        return t;
//    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer>  list = new ArrayList<>();
        for (int i : nums1) {
            list.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        list.retainAll(set2);
        set1.addAll(list);
        return set1.stream().mapToInt(i->i).toArray();






//        int same = 0;
//        //暴力解法
//        for (int i = 0; i < nums1.length; i++) {
//            for (int i1 = 0; i1 < nums2.length; i1++) {
//                if (nums1[i] == nums2[i1]){
//                    same++;
//                }
//            }
//        }
//        int[] result = new int[same];
//        int k = 0;
//        for (int i = 0; i < nums1.length; i++) {
//            for (int i1 = 0; i1 < nums2.length; i1++) {
//                if (nums1[i] == nums2[i1]){
//                    result[k++] = nums1[i];
//                }
//            }
//        }
//        //排序
//        Arrays.sort(result);
//        //删除相同的
//        int num =  removeDuplicates(result);
//        int[] rs = new int[num];
//        for (int i = 0; i < num; i++) {
//            rs[i] = result[i];
//        }
//        return rs;
    }
}
