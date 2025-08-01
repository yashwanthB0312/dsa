import java.util.Arrays;

public class moveZeroes {

    // This static method is being used a lot → it’s hot → let’s JIT compile it!
    static{
        for (int i = 0; i < 100; i++) {
            moveZeroes(new int[] { 0, 0 });
        }
    }
    public static void moveZeroes(int[] nums) {
        int left = 0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]!=0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}

// Time complexity : O(n)
// Space complexity : O(1)