//creating a method printwelcome that prints a greeting 

public class Methodspratice1 {

public static String GreetUser(String name){
    String message="Hello ," + name;
    return message; //returns a string value
}

    public static void main(String args[]) {
        String message = GreetUser("Alex");
        System.out.println(message);
    }
}
