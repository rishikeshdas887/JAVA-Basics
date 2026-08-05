public class pattern8 {
    public static void main(String[] args) {
        int n = 9; // no.of rows

        for (int row = 1; row <= n; row++) { // handle rows

            // for each row-> the number of columns will be =n-r
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }
            System.out.println();

            // the number of rows is the
        }
    }

}
