/*
 * step1: complie java code each time to see result
 * -- $ javac Hello.java
 * step2: then run the code
 * -- $ java Hello
 */

/*
    Conditionals in JAVA
    if else elseif
    Ternary operator
    Switch
*/
public class Conditionals {
    public static void main(String[] args) {
        String color = "red";

        if (color == "blue") {
            System.out.println("The color is blue");
        } else if (color == "green") {
            System.out.println("The color is green");
        } else {
            System.out.println("The color is blue");

        }

        // Ternary operator
        boolean result = color == "blue" ? true : false;
        if (result) {
            System.out.println("blue");
        } else
            System.out.println("unknown");

        // swicth case
        switch (color) {
            case "blue":
                System.out.println("blue");
                break;

            case "green":
                System.out.println("green");
                break;

            case "yellow":
                System.out.println("yellow");
                break;

            default:
                System.out.println("red");
                break;
        }
    }
}
