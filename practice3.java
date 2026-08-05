///printing 10 multiples of n 

import java.util.Scanner;

public class practice3 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {

            System.out.println(i * n);

        }
        scanner.close();
    }

}
