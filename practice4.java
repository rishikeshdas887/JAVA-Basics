//printing name 100 times
import java.util.Scanner;
public class practice4 {
    public static void main(String args[]) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = scanner.next();
        for (int i = 1; i <= 100; i++) {
            System.out.println(name);
        }
        scanner.close();

    }
}
