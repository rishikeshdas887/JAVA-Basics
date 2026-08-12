import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
    
    
      // taking input in array
        int crr[] = new int[5]; // 5 data ko store krega int type ke
        Scanner sc = new Scanner(System.in);
        int b = crr.length;
        for (int i = 0; i <= b - 1; i++) {
            System.out.println("Provide Index: "+ i);
            crr[i] = sc.nextInt();

        }
System.out.println("your array contins:");
        for (int val : crr) {
            System.out.println(val);
        }
}
}