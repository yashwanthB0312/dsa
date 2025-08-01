public class minElementRotatedSorted {
    public static int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        int res = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(nums[low]<=nums[high]){
                res = Math.min(res,nums[low]);
                break;
            }
            if(nums[low]<=nums[mid]){
                res = Math.min(res,nums[low]);
                low=mid+1;
            }else{
                res = Math.min(res,nums[mid]);
                high = mid-1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(findMin(nums));
    }
}
