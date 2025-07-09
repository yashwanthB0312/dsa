public class printOneToN {
    static int n = 5;

    static void helper(int i){
        if(i==0) return;
        helper(i-1);
        System.out.println(i);
    }
    public static void main(String[] args) {
        helper(n);
    }
}
