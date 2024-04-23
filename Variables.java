/*
 * step1: complie java code each time to see result
 * -- $ javac Hello.java
 * step2: then run the code
 * -- $ java Hello
 */

/*
 Java Type Casting

Type casting is when you assign a value of one primitive data type to another type.

In Java, there are two types of casting:

    Widening Casting (automatically) - converting a smaller type to a larger type size
    byte -> short -> char -> int -> long -> float -> double

    Narrowing Casting (manually) - converting a larger type to a smaller size type
    double -> float -> long -> int -> char -> short -> byte 
 */
public class Variables {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic cast
        int myNarrowInt = (int) myDouble; // Manual narrow casting

        System.out.println(myDouble);
        System.out.println(myNarrowInt);
    }
}
