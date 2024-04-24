/*
 * step1: complie java code each time to see result
 * -- $ javac Hello.java
 * step2: then run the code
 * -- $ java Hello
 */

/*
    For Loop
    For Each loop
*/
public class Loops {
    public static void main(String[] args) {
        String[] fruits = {"apple","banana","pineapple"};

        for(int i=0; i<100; i++){
            System.out.println(i);
        }

        for (String item : fruits) {
            System.out.println(item);
        }

    }
}
