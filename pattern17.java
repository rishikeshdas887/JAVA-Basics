public class pattern17 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                
                    int a = n - col;
                    int b = 'A';
                    int res = a + b;
                    char finalRes = (char)res;
                    System.out.print(finalRes + " ");
                }
 System.out.println();
            }
           

            
        }
}
