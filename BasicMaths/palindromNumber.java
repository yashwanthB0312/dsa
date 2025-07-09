public class palindromNumber {
    static int n = -121;

    static boolean helper(){
        String s = String.valueOf(n);
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }
    public static void main(String[] args) {
        boolean res = helper();
        System.out.println(res);
    }
}
