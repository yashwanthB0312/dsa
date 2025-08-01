import java.util.Arrays;

public class firstAndLastOccurence {
    public static int[] searchRange(int[] nums, int target) {
        int first = firstOccurence(nums,0,nums.length-1,target);
        if(first==-1) return new int[]{-1,-1};
        int last = lastOccurence(nums,0,nums.length-1,target);
        return new int[]{first,last};
    }
    
    public static int firstOccurence(int[] nums, int low, int high, int target) {
        int val=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                val=mid;
                high=mid-1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return val;
    }

    public static int lastOccurence(int[] nums, int low, int high, int target) {
        int val=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                val=mid;
                low=mid+1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return val;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] res = searchRange(nums, target);
        System.out.println(Arrays.toString(res));
    }
}

// Time complexity : O(log n + log n) = O(log n)
// Space complexity : O(1)