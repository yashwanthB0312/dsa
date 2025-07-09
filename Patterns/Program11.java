public class Program11 {
    public static void main(String[] args) {
        int n=5;
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+++" ");
            }
            System.err.println();
        }
    }   
}

// Time complexity : O(n^2)
// Space complexity : O(1)