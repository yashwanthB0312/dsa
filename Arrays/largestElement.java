class largestElement {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3,7,3};
        int maxi = Integer.MIN_VALUE;
        for(int i:arr){
            maxi = Math.max(maxi,i);
        }
        System.out.println(maxi);
    }
}

// Time complexity : O(n)
// Space complexity : O(1)