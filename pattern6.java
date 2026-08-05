//printing rhombus

public class pattern6 {
    public static void main(String args[]) {
        int n = 6; // no.of rows
        for (int row = 1; row <= n; row++) { // loop to handle rows
            for (int col = 1; col <= n - row; col++) {// inner loop to print spaces
                System.out.print(" ");
            }
            for (int col = 1; col <= n; col++) { // loop to print stars
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
