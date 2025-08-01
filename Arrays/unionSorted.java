import java.util.ArrayList;
import java.util.List;

public class unionSorted {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5}; 
        int[] arr2 = {2,3,4,4,5};
        List<Integer> list = new ArrayList<>();
        int i=0, j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                if(list.size()==0 || list.get(list.size()-1)!=arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
            } else if(arr1[i]>arr2[j]){
                if(list.size()==0 || list.get(list.size()-1)!=arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
            } else { // arr1[i]==arr2[j]
                if(list.size()==0 || list.get(list.size()-1)!=arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        while(i<arr1.length){
            if(list.size()==0 || list.get(list.size()-1)!=arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }
        while(j<arr2.length){
            if(list.size()==0 || list.get(list.size()-1)!=arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }
        System.out.println(list);
    }
}

// Time complexity : O(n1+n2)
// Space complexity : O(n1+n2)