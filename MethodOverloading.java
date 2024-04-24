/*
 * step1: complie java code each time to see result
 * -- $ javac Hello.java
 * step2: then run the code
 * -- $ java Hello
 */

/*
    Methods ---> functions
    Methods --- > Paramerters
    Method --> Overloading
    With method overloading, multiple methods can have the same name with different parameters:

    int myMethod(int x)
    float myMethod(float x)
    double myMethod(double x, double y)
*/
public class MethodOverloading {

    static int addNumbers(int x, int y) {
        return x + y;
    }

    static float addNumbers(float x, float y) {
        return x + y;
    }

    static double addNumbers(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {

        System.out.println(addNumbers(5, 3));
        System.out.println(addNumbers(5.5f, 4.2f));
        System.out.println(addNumbers(5.23232400000005, 3.000000005345));
    }
}
