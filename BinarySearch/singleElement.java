/* You are given a sorted array consisting of only integers where every element appears exactly twice, 
except for one element which appears exactly once. */

public class singleElement {
    public static int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length-1;
        while(low<high){
            int mid = (low+high)/2;
            if(nums[mid]==nums[mid^1]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return nums[low];
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        int res = singleNonDuplicate(nums);
        System.out.println(res);
    }
}
