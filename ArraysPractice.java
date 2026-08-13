//print a 2d array having memory allocation of  fixed rows but varaible columns

//brute force solution for a jagged array
public class ArraysPractice {
    public static void main(String args[]) {
        int[][] arr;// creation
        arr = new int[4][];// allocation

        // initialization
        int[][] brr = {
                { 1, 2 },
                { 2, 3, 7, 88, 90 },
                { 30, 50, 40, 60, 20, 10, 22, 66, 44, 80 },
                { 100 },

        };

        int rowLength = brr.length;
        for (int row = 0; row <= rowLength - 1; row++) {
            int colLength = brr[row].length;
            for (int col = 0; col <= colLength - 1; col++) {
                System.out.print(brr[row][col]+ " ");
                

            }
System.out.println();
        }

        //traversing an 2d array-->inside every row visit every element 
//optimal solution for a jagged array
    for(int rowIndex=0;rowIndex<=brr.length-1;rowIndex++){
        for(int colLength=0;colLength<=brr[rowIndex].length-1;colLength++){
            System.out.print(brr[rowIndex][colLength]+ " ");

        }
        System.out.println();
    }

    }
}