//printing a hollow diamond pattern
public class HollowDiamondPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            // printing the 1st star of 1st row
            if (row == 1) {
                for (int col = 1; col <= 2 * row - 1; col++) {
                    System.out.print("*");
                }
            }
            // middle rows
            else {
                System.out.print("*");

                for (int col = 1; col <= 2 * row - 3; col++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        // part 2
        for (int row = 1; row <= n - 1; row++) {

            // part1
            for (int col = 1; col <= row; col++) {
                System.out.print(" ");

            }
            if (row == n - 1) {
                System.out.print("*");
            } else {// remaining rows
                System.out.print("*"); // printing star first and then spaces
                for (int col = 1; col <= 2 * (n - row) - 3; col++) {
                    System.out.print(" ");
                }
                System.out.print("* ");
            }

            System.out.println();// move to next row

        }

    }
}
