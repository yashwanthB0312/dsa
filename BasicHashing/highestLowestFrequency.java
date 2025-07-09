import java.util.HashMap;
import java.util.Map;

public class highestLowestFrequency {
    static int[] arr = {10,5,10,15,10,5};
    static int mini = Integer.MAX_VALUE;
    static int miniv = Integer.MAX_VALUE;
    static int maxi = Integer.MIN_VALUE;
    static int maxiv = Integer.MAX_VALUE;

    public static void main(String[] args) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer,Integer>mapEntry:hm.entrySet()){
            if(mapEntry.getValue()>maxi){ maxi=mapEntry.getValue(); maxiv=mapEntry.getKey();}
            if(mapEntry.getValue()<mini){ mini=mapEntry.getValue(); miniv=mapEntry.getKey();}
        }
        System.out.println(maxiv+" "+miniv);
    }
}
