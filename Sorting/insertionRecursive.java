import java.util.Arrays;

public class insertionRecursive {
    static void insertion(int[] arr,int n){
        if(n<=1) return;
        insertion(arr, n-1);
        int last = arr[n-1];
        int j = n-2;
        while(j>=0 && arr[j]>last){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=last;
    }
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 5, 3};
        insertion(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}

// Time complexity : O(n^2)
// Space complexity : O(1)
