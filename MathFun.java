/*
 * step1: complie java code each time to see result
 * -- $ javac Hello.java
 * step2: then run the code
 * -- $ java Hello
 */

/*
    Math Methods

    max(x,y)
    min(x,y)
    sqrt(x)
    abs(-x)
    pow(x, r)
    random()
*/
public class MathFun {
    public static void main(String[] args) {
        System.out.println(Math.max(1, 2));
        System.out.println(Math.min(1, 2));

        System.out.println(Math.sqrt(3));
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.abs(-3));

        System.out.println(Math.random());

        // Generate random int number
        int result = (int) Math.round(Math.random() * 100);

        System.out.println(result);
    }
}
