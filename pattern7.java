//inverted right angle pattern

public class pattern7 {
    public static void main(String[] args) {
        int n = 7;
        for (int row = 1; row <= n; row++) { // handle rows
            for(int col = 1; col <= n - row + 1; col++) { // for each row col=n-r+1 columns are there
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
