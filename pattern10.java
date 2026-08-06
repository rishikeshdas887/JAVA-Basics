public class pattern10 {
    public static void main(String[] args) {
        int n = 4;
        for (int row = 1; row <= n; row++) {

            // for each row there are 6 columns
            for (int col = 1; col <= 6; col++) {
                if (row == 1 || row == n) {
                    System.out.print("* ");
                } else {
                    if (col == 1) {
                        System.out.print("* ");
                    } else if (col == 6) {
                        System.out.print("* ");
                    } else { // middle columns
                        System.out.print("  "); // 2 gaps to change the 2characters

                    }

                }
            }
            System.out.println();
        }

    }

}
