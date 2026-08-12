// ques- find max in an array

public class Arrays4 {
    public static void main(String[] args) {
        // finding maximum in an array
        int arr[] = { 3, 5,10, 60, 90 };
        int n = arr.length;
        int maxValue = arr[0];
        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        System.out.println(maxValue);
        // compare maxValue with each elemnt in the array
    }
}
