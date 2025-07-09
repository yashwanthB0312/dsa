public class countDigit{
    static int n = 24;
    public static void main(String[] args) {
        int val = n;
        int cnt = 0;
        while(val>0){
            val/=10;
            cnt++;
        }
        System.out.println(cnt);
    }
}