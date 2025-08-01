public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {7,1,3,4,5,6,6,6,6,6};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i:arr){
            if(i>first){
                second=first;
                first=i;
            }else if(i>second && i!=first){
                second=i;
            }
        }
        System.out.println(second);
    }
}

// Time complexity : O(n)
// Space complexity : O(1)