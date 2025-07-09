public class factorial {
    static int n = 5;

    static int helper(int i){
        if(i==1) return 1;
        return i*helper(i-1);
    }

    public static void main(String[] args) {
        int res = helper(n);
        System.out.println(res);
    }
}
