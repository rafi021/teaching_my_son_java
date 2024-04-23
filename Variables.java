/*
 * step1: complie java code each time to see result
 * -- $ javac Hello.java
 * step2: then run the code
 * -- $ java Hello
 */

/*
 *  -->>Variables are containers for storing data values <<--

    In Java, there are different types of variables, for example:

   a. String - stores text, such as "Hello". String values are surrounded by double quotes
   b. int - stores integers (whole numbers), without decimals, such as 123 or -123
   c. float - stores floating point numbers, with decimals, such as 19.99 or -19.99
   d. char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
   e. boolean - stores values with two states: true or false

   
 */
public class Variables {
    public static void main(String[] args) {
        String name = "my name is Omar bin Ibrahim Araf";
        int schoolClass = 1;
        float age = 5.5f;
        double storedMoney = 4538.5;
        char favLetter = 'O';
        boolean child = true;

        System.out.println(name + "I read in class: " + schoolClass);
        System.out.println("I am " + age + "years old");
        System.out.println("i have banked" + storedMoney + "in my personal bank");
        System.out.printf("My fav. letter is ->%c ", favLetter);
        System.out.print("Am i a Child? Ans:" + child);
    }
}
