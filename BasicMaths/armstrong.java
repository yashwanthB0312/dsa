public class armstrong {
    static int sample = 153; // true
    // static int sample = 12; // false
    public static void main(String[] args) {
        int val = 0;
        int dup = sample;
        int n = sample;
        int cnt = 0;
        while(dup>0){
            dup/=10;
            cnt++;
        }
        while(n>0){
            int v = n%10;
            val+=Math.pow(v, cnt);
            n/=10;
        }
        System.out.println(val==sample);
    }
}
