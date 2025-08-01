public class missingNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,0,4,5};
        int n = arr.length;
        int xor1=0,xor2=0;
        for(int i=0;i<n-1;i++){
            xor2 = xor2^arr[i];
            xor1 = xor1^arr[i+1];
        }
        // xor1=xor1^arr[n-1];
        System.out.println(xor1);
    }
}

// Time complexity : O(n)
// Space complexity : O(1)
