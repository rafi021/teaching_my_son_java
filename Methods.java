/*
 * step1: complie java code each time to see result
 * -- $ javac Hello.java
 * step2: then run the code
 * -- $ java Hello
 */

/*
    Methods ---> functions
*/
public class Methods {

    static String first_name = "Omar";
    static String last_name = "Bin Ibrahim";

    static void printFullName() {
        System.out.println("My Name is Omar bin Ibrahim");
    }

    static void printFullNameWithParams(String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }

    static String returnFullName() {
        return "Omar Bin Ibrahim Araf";
    }

    static String returnFullNameWithParams(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {

        // Call methods
        printFullName();
        printFullNameWithParams("Omar", "bin Ibrahim");

        System.out.println(returnFullName());
        System.out.println(returnFullNameWithParams(first_name, last_name));
    }
}
