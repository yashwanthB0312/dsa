public class removeDuplicateInSorted {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,5,5,6,7,7,7,8};
        int i=0,j=1;
        while(j<arr.length){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
            j++;
        }
        System.out.println(i+1);
    }
}

// Time complexity : O(n)
// Space complexity : O(1)