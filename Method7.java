//write  amethod updatevalue(intx) and verify that original variable in main does not change 
//pass by value question 
public class Method7 {

    public static int MethodE(int x) {
        x = 40;
        
       return x;
    }

    public static void main(String[] args) {
        int a = 10;
        MethodE(a);//changing parameters does not changes the original value
        //doesnt changes the original value until it is stored in an int
        System.out.println(a);
    }
}
