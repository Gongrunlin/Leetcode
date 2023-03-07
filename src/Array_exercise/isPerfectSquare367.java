package Array_exercise;

public class isPerfectSquare367 {
    public static void main(String[] args) {

    }


    public boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int t = num / mid;
            if (t == mid) {
                if (num%mid == 0) return true;
                low = mid + 1;
            } else if (t < mid) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;

    }





}
