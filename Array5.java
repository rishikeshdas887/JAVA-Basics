public class Array5 {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 7, 80, 70, 60 };
        int n = arr.length;
        int minValue = arr[0];
        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println(minValue);
    }
}
