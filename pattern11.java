public class pattern11 {
    public static void main(String args[]) {

        int n = 7; // no.of rows
        for (int row = 1; row <= n; row++) {

            if (row == 1 || row == 2 || row == n) {
                for (int col = 1; col <= row; col++) {
                    System.out.print(" *");
                }

            } else {
                System.out.print(" *"); // printing middle rows

                // (row-2) spaces
                for (int col = 1; col <= row - 2; col++) {
                    System.out.print("  ");
                }
                System.out.print(" *");

            }
            System.out.println();

        }

    }
}
