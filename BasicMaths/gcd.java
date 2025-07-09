public class gcd {
    static int n1 = 9, n2 = 8;
    public static void main(String[] args) {
        int val = Math.min(n1, n2);
        for(int i=val;i>=1;i--){
            if(n2%i == n1%i){
                System.out.println(i);
                break;
            }
        }
    }
}
