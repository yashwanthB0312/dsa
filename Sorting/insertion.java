import java.util.Arrays;

// takes an element & place it in correct position

public class insertion {
    static int arr[] = {7, 4, 1, 5, 3};

    static void swap(int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j>0;j--){
                if(arr[j-1]<arr[j]) break;
                swap(j-1,j);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

// Time complexity : {Best : O(n) , worst : O(n^2)}
// space complexity : O(1)
