public class sumOfNNumbers {
    static int n = 2;

    static int helper(int i){
        if(i==0) return 0;
        return i + helper(i-1);
    }
    public static void main(String[] args) {
        int res = helper(n);
        System.out.println(res);
    }
}
