/*
 * step1: complie java code each time to see result
 * -- $ javac Hello.java
 * step2: then run the code
 * -- $ java Hello
 */

/*
    Arrays
*/
public class Arrays {
    public static void main(String[] args) {
        String[] fruits = { "apple", "banana", "pineapple" }; // array
        int[] nums = { 1, 2, 3, 4, 5, 6 };

        for (int i = 0; i < nums.length; i++) {
            System.out.println(i);
        }

        for (String item : fruits) {
            System.out.println(item);
        }

        nums[0] = 0; // change array element value

    }
}
