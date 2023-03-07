package Array_exercise;

public class MinSubArrayLen209 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target,nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            result[i] = 0;
            for (int j = i; j < nums.length; j++){
                sum += nums[j];
                if (sum>=target){
                    result[i] = j-i+1;
                    break;
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        //找除了0最小的那一个
        int min = 0;
        for (int i = 0; i < result.length; i++) {
            if (min > result[i] && result[i]!=0){
                min = result[i];
            }
        }
        return min;
    }
}
