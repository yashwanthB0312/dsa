import java.util.*;

public class countingFreqency {
    static int arr[] = {1,2,3,4,5,4,3,2,5,1};
    public static void main(String[] args) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        List<List<Integer>>list = new ArrayList<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
            List<Integer>temp = new ArrayList<>();
            temp.add(entry.getKey());
            temp.add(entry.getValue());
            list.add(temp);
        }
        System.out.println(list.toString());
    }    
}
