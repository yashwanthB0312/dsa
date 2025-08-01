public class checkSortedAndRotated {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4};
        int n = arr.length;
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(arr[i] > arr[(i+1)%n]) cnt++;
        }
        System.out.println((cnt<2)? "true" : "false");
    }
}

// Time complexity : O(n)
// Space complexity : O(1)