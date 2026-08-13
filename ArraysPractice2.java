import java.util.Scanner;

public class ArraysPractice2 {
    public static void main(String args[]) {
        int arr[][] = new int[4][5];
        Scanner sc = new Scanner(System.in);

        // input
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.println("Provide me the value for row" + i + "  and col" + j + ":");
                arr[i][j] = sc.nextInt();
            }
        }

        // outputp or print
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }

}
