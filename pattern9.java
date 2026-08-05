public class pattern9 {
    public static void main(String[] args) {
        int n = 7;
        for (int row = 1; row <= n; row++) {

            // for each rows-> varaible columns
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * n - 2 * row + 1; col++) {
                System.out.print("*");

            }
               System.out.println();
        }
    }
}
