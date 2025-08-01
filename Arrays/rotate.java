import java.util.Arrays;

public class rotate {

    static void swap(int[] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        int n = arr.length;
        k = k % arr.length;
        swap(arr, 0, n-k-1);
        swap(arr,n-k,n-1);
        swap(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}

// Time complexity : O(n)
// Space complexity : O(1)