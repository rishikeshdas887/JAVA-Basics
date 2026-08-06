//printing a hollow pyramid 

public class pattern12 {
    public static void main(String args[]) {
        int n = 9;
        for (int row = 1; row <= n; row++) { // part 1

            for (int col = 1; col <= n - row; col++) {

                System.out.print(" "); // priting spaces
            }

            // part2

            if (row == 1 || row == n) { // print how many stars in row 1 and last row
                for (int col = 1; col <= 2 * row - 1; col++) {
                    System.out.print("*");
                }

            } else {
                System.out.print("*"); // 1 star print
                for (int col = 1; col <= 2 * row - 3; col++) {
                    System.out.print(" "); // 2r-3 spaces to be printed in next row after printing one star
                }
                System.out.print("* ");// again printing one star

            }
            System.out.println();// moving to next row
        }
    }

}