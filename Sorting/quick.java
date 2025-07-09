import java.util.Arrays;

public class quick {
    static int[] arr = {4,6,2,5,7,9,1,3};

    static void swap(int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int quickArr(int[] arr,int low,int high){
        int pivot = arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1) i++;
            while(arr[j]>pivot && j>=low+1) j--;
            if(i<j) swap(i,j);
        }
        swap(low,j);
        return j;
    }

    static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int idx = quickArr(arr,low,high);
            quickSort(arr, low, idx-1);
            quickSort(arr, idx+1, high);
        }

    }
    public static void main(String[] args) {
        int n = arr.length;
        quickSort(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }
}

// Time complexity : { Best : O(nlogn) , Worst : O(n^2) }
// Space complexity : O(1)