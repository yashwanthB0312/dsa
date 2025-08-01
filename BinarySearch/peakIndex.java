import java.util.*;

public class peakIndex {
    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        int low = 1;
        int high = n - 2;
        int peak = -1;
        if (n == 1)
            return 0;
        if (nums[0] > nums[1])
            return 0;
        if (nums[n - 1] > nums[n - 2])
            return n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                peak = Math.max(peak, mid);
                low = high + 1;
            } else if (nums[mid + 1] > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return peak;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        int res = findPeakElement(nums);
        System.out.println(res);
    }
}
