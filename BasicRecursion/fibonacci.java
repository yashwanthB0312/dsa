public class fibonacci {
    static int num = 5;
    static int helper(int n){
        if(n==1 || n==0) return n;
        return helper(n-1)+helper(n-2);
    }
    public static void main(String[] args) {
        int res = helper(num-1);
        System.out.println(res);
    }
}
