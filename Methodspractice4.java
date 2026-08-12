public class Methodspractice4 {
    public static int GetMaximum(int a,int b){
       if(a>b){
        return a;

       }
       else{
        return b;
       }
    }
    public static void main(String[] args) {
        int Maximum =GetMaximum(6,90);
        System.out.println(Maximum);
    }

}
