public class ArraysPractice3 {

    public static void main(String args[]) {
        int[][] arr = new int[4][];// allocation

        // initialization
        int[][] brr = {
                { 1, 2 },
                { 2, 3, 7, 8, 9 },
                { 3, 5, 4, },
                { 1 }
        };

        int rowLength = brr.length;
        int sum = 0;
        int ans = 1;
        for (int row = 0; row <= rowLength - 1; row++) {

            for (int col = 0; col <= brr[row].length - 1; col++) {
                int value = brr[row][col];
                sum = sum + value;
                ans = ans * value;

            }

        }
        System.out.println(sum);
        System.out.println(ans);
    }
}
