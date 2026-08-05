//print all integers in range from 50-100 that are divisible by 7

public class practice7 {
    public static void main(String[] args) {

        for (int i = 50; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }

        }
    }
}
