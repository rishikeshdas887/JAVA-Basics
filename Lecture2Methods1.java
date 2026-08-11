public class Lecture2Methods1 {
    // declaration/definition
    static void print2kaTable() {
        for (int i = 1; i <= 10; i++) {
            int ans = 2 * i;
            System.out.println("->" + ans);
        }
    }

    static void printSum(int x, int y) {
        System.out.println("Sum: " + (x + y));
    }

    public static void main(String[] args) {
        System.out.println("BYe");
        print2kaTable();
        printSum(5,10);
    }
}
