
//print all sum of number from 1 to n 
import java.util.Scanner;

public class practice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i += 1) {
            sum = sum + i;
            System.out.println(sum);
        }

        scanner.close();
    }

}
