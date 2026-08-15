public class String1 {
    public static void main(String args[]) {
        String firstName = "Love";
        String lastName = new String("babbar");
        String name1 = "love";
        String name2 = "LOVE";

        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("BOTH ARE EQUAL");
        } else {
            System.out.println("Both strings are equal");
        }
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.length());
        System.out.println(firstName.charAt(3));
    }
}