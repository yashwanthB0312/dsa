public class searchElement {

    static int binarySearch(int[] arr,int low,int high,int target){
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }

    static int recursive(int[] arr,int low,int high,int key){
        if(low>high) return -1;
        int mid = (low+high)/2;
        if(arr[mid]==key) return mid;
        else if(arr[mid]<key) return recursive(arr, mid+1, high, key);
        return recursive(arr, low, mid-1, key);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 10;
        int low=0,high=arr.length-1;
        System.out.println(binarySearch(arr, low, high, target));
        System.out.println(recursive(arr, low, high, target));
    }
}

// Time complexity  : O(log2n)
// Overflow : when low=Integer_MAX_VALUE , high=Integer.MAX_VALUE => use mid = low+(high-low)/2