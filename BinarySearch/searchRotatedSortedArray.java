public class searchRotatedSortedArray {
    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target) return mid;
            // If contains duplicate numbers
            /*
            if(nums[mid]==nums[low] && nums[mid]==nums[high]){
                low++;
                high--;
                continue;
            }
            */
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]) high=mid-1;
                else low=mid+1;
            }else{
                if(nums[mid]<=target && target<=nums[high]) low=mid+1;
                else high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));
    }
}

// Time complexity : O(logn)
// Space complexity : O(1)