import java.util.Arrays;

public class bubbleRecursive {
    static void bubble(int[] arr,int n){
        if(n==1) return;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubble(arr, n-1);
    }
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 5, 3};
        bubble(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
