
public class Arrays1 {
    public static void main(String args[]) {
        // declaraton
        int arr[];
        // allocation
        arr = new int[9];
        // initialisation
        int brr[] = { 1, 2, 3 };
        System.out.println(brr[1]);

        int n = brr.length;
        // for(int index=0;index<=n-1;index++){
        // System.out.println(brr[index]);
        // }
        for (int val : brr) {
            System.out.println(val);

        }
      
    }

}
