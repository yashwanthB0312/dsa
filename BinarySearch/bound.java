import java.util.HashSet;

public class bound {

    static int lowerBound(int[] arr,int low,int high,int key){
        int ans = arr[high];
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=key){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

    static int upperBound(int[] arr,int low,int high,int key){
        int ans = arr[low];
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<=key){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int key = 6;
        System.out.println(lowerBound(arr, 0, 5, key));
        System.out.println(upperBound(arr, 0, 5, key));

    }
}
