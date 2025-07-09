public class reverseNumber {
    static int n = 123;
    public static void main(String[] args) {
        int val = 0;
        while(n>0){
            val = val*10 + (n%10);
            n/=10;
        }
        System.out.println(val);
    }
}
