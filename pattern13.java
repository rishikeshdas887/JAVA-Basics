public class pattern13 {
    public static void main(String arg[]) {
        int n = 4;
        // part1 -left side traingle 
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            // part 2
//spaces between two upper half traingles
            for (int col = 1; col <= 2 * (n - row); col++) {
                System.out.print("  ");
            }

//part 3-right side traingle
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }


            
            System.out.println();
        }


        //for lower half part of the pattern 

        //1.making the right isde of the inverted triangle
             for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
           System.out.print("* ");
            }
                 //printing spaces in between the two inverted traingles
            for (int col = 1; col <=2*(row-1) ; col++) {
           System.out.print("  ");
            }
          

            //printing the left side inverted traingle
            for (int col=1; col<=n-row+1;col++) {
                 System.out.print("* ");
            }


            System.out.println();

        }

    }
}