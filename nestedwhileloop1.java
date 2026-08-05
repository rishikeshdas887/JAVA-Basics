public class nestedwhileloop1 {
    public static void main(String args[]) {
        int i = 1;
        while (i <= 4) {
            int j = 1;
            while (j <= 3) {
                System.out.println("i=" + i + "j=" + j);
                j++;
            }
            i++;
        }

    }
}
