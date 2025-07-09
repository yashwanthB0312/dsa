public class printNToOne {
    static int n = 5;

    static void helper(int i){
        if(i==0) return;
        System.out.println(i);
        helper(i-1);
    }
    public static void main(String[] args) {
        helper(n);
    }
}
