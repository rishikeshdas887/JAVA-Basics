public class ArraysPractice4 {

    //finding the max value in an 
    public static void main(String[] args) {
        int arr[][]={{1,2,3}, 
        {2,5,13,55}
    };
   int maxValue=arr[0][0];
   for(int i =0;i<=arr.length-1;i++){
    for(int j =0; j<=arr[i].length-1;j++){
        if (arr[i][j]>maxValue) {
            maxValue=arr[i][j];
        }
    }

   }
       System.out.println(maxValue);


       //print the minimum  in an 2D array 
   int minValue=arr[0][0];
   for(int i =0;i<=arr.length-1;i++){
    for(int j =0; j<=arr[i].length-1;j++){
        if (arr[i][j]<minValue) {
            minValue=arr[i][j];
        }
    }
}
           System.out.println(minValue);


    }
}
