//print all prime numbers from 1 -100

public class PRACTICE5 {
    public static void main(String[] args) {
        for (int i=2;i<=100;i++){
        boolean isPrime=true;
        for(int j=2 ; j<i;j++){
if(i%j==0){
    isPrime=false;
    break; //exit inner loop immediately
}
        }

        if(isPrime){
            System.out.println(i);
        }
    }
            
        }
         }
        

