import java.util.ArrayList;

public class printDivisors {
    static int n = 8;
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr.add(i);
            }
        }
        System.out.println(arr.toString());
    }
}
