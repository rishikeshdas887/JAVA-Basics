//printing counting from n to 1



import java.util.Scanner;

public class practice2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); // scanner that read input from keyboard

        System.out.print("Enter n :"); // uses print not println because to print in one line not in next line
        int n = scanner.nextInt(); // scanner taking input from user from the Enter n:

        for (int i = n; i <= 1; i++) {
            System.out.println(i);


            
        }
        scanner.close(); // closing the scanner
    }
}