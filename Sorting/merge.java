import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class merge {
    static int[] arr = {7, 4, 1, 5, 3};
    static void mergeArr(int[] arr,int low,int mid,int high){
        List<Integer>temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid) temp.add(arr[left++]);
        while(right<=high) temp.add(arr[right++]);
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }

    static void mergeSort(int[] arr,int low,int high){
        if(low==high) return;
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        mergeArr(arr,low,mid,high);
    }

    public static void main(String[] args) {
        int n = arr.length;
        mergeSort(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }
}

// Time complexity : { Best : O(nlogn) , Worst : O(nlogn) }
// Space complexity : O(N)