//printing a solid diamond pattern

public class soliddiamondpattern {
  public static void main(String[] args) {
    int n =5;
      for (int row=1;row<=n ;row++){
  for(int col=1; col<=n-row; col++ ){
    System.out.print(" ");
  }
  //stars 
  for(int col=1 ; col<=2*row-1;col++){
  System.out.print("*");
  }
  //move to next rows;
System.out.println();
      }


//part 2 
for(int row=1; row<=n;row++){
if(row==1){
  continue;
}
     for(int col=1; col<=row-1; col++ ){
    System.out.print(" ");//pritning spaces
  }
 for(int col=1 ; col<=2*n-2*row+1;col++){
  System.out.print("*"); //printing stars first 
  }
 
  //move to next rows;
System.out.println();
}

  }
}
