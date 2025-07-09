import java.util.Arrays;

public class selectionRecursive {
    static void selection(int[] arr,int i){
        if(i>=arr.length-1) return;
        int mini = i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[mini]) mini=j;
        }
        int temp = arr[i];
        arr[i] = arr[mini];
        arr[mini] = temp;
        selection(arr, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 5, 3};
        selection(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
}
