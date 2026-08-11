public class pattern19 {
    public static void main(String[] args) {
    
    int n =4;


    //part 1
        for (int row=1;row<=n;row++) {
            for (int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
//part 2
             for (int col=1;col<=2*row-1;col++){
                System.out.print(row+" ");
            }
           System.out.println();
        }
    }
}
