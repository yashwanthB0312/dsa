public class Program1 {
    public static void main(String[] args) {
        int n = 4;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

// Time complexity : O(n^2)
// Space complexity : O(1)