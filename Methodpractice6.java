
//priting an overloaded method with one string parameter or an integer parameter 
public class Methodpractice6 {
    public static String Display(String name) {
        String naming = "Hello , " + name;
        return naming;

    }

    public static String Display(int number) {
        String result = "Hello ," + number;
        return result;

    }

    public static void main(String[] args) {
        String FinalAns=Display("Rishi");
         String  NextAns=Display(100);
         System.out.println(FinalAns);
            System.out.println(NextAns);
    }

}
