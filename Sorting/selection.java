import java.util.Arrays;

// select the minimum and swap 

public class selection {
    static int arr[] = {7, 4, 1, 5, 3};

    static void swap(int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int idx = i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[idx]){
                    idx=j;
                }
            }
            swap(i, idx);
        }
        System.out.println(Arrays.toString(arr));
    }
}

// Time complexity : O(n^2)
// Space complexity : O(1)