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

    Data types are divided into two groups:

    Primitive data types - includes byte, short, int, long, float, double, boolean and char
    Non-primitive data types - such as String, Arrays and Classes   


    Data Type 	Size 	Description
    byte 	    1 byte 	    Stores whole numbers from -128 to 127
    short 	    2 bytes 	Stores whole numbers from -32,768 to 32,767
    int 	    4 bytes 	Stores whole numbers from -2,147,483,648 to 2,147,483,647
    long 	    8 bytes 	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    float 	    4 bytes 	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    double 	    8 bytes 	Stores fractional numbers. Sufficient for storing 15 decimal digits
    boolean 	1 bit 	    Stores true or false values
    char 	    2 bytes 	Stores a single character/letter or ASCII values
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
