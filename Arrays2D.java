public class Arrays2D {
    public static void main(String[] args){
        //declaration 
        int arr[][];
        //allocation
        arr=new int[3][4];

        //init
        int[][]brr={
       {2,3},
       {3,4,5},
       {4,5,4,10}, 
       {5},

        };
        // System.out.println(brr[3][1]);
        //using nested loop
        int rowLength=brr.length;
        // int colLength=brr[1].length; //works when col elements =row elements 
        int colLength=brr[rowLength].length;
        for(int row=0;row<=rowLength-1;row++){
             for(int col=0;col<=colLength-1;col++){
                System.out.print(brr[row][col]+" ");
             }
        System.out.println();
            }

    }
}
