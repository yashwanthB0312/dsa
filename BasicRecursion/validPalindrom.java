public class validPalindrom {
    static String str = "racecar";
    static boolean helper(int i,String s){
        if(i>=s.length()/2) return true;
        if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        return helper(i+1, s);
    }
    public static void main(String[] args) {
        boolean res = helper(0, str);
        System.out.println(res);
    }
}
