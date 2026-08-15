import java.util.Scanner;

public class String2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide me a content : ");
        String str = sc.nextLine();
        System.out.println("Value: " + str);

        String Str = "    ";
        System.out.println(str.length());
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
        String name = "Love";
        name = name.trim(); // for trimming store it inside a string

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        String risi = "My name is love babbar";
        System.out.println(risi.substring(3, 6));

    }
}