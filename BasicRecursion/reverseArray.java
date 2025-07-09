public class reverseArray {
    static int[] arr = {1,2,3,4,5};

    static void helper(int[] arr,int i){
        if(i==arr.length) return;
        helper(arr, i+1);
        System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        helper(arr, 0);
    }
}
