import java.util.Arrays;

// push the maximum to the last by adjacent swaps

public class bubble {
    static int arr[] = {7, 4, 1, 5, 3};

    static void swap(int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            boolean swaped = false;
            for(int j=1;j<n-i;j++){
                if(arr[j-1]>arr[j]){
                    swap(j-1, j);
                    swaped=true;
                }
            }
            if(!swaped) break;
        }
        System.out.println(Arrays.toString(arr));
    }
}

// Time complexity : {Best : O(n) , worst : O(n^2)}
// space complexity : O(1)