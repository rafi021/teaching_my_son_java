/*
 * step1: complie java code each time to see result
 * -- $ javac Hello.java
 * step2: then run the code
 * -- $ java Hello
 */

/*
 Operator 	Name 	Description 	Example 
    + 	Addition 	Adds together two values 	x + y 	
    - 	Subtraction 	Subtracts one value from another 	x - y 	
    * 	Multiplication 	Multiplies two values 	x * y 	
    / 	Division 	Divides one value by another 	x / y 	
    % 	Modulus 	Returns the division remainder 	x % y 	
    ++ 	Increment 	Increases the value of a variable by 1 	++x 	
    -- 	Decrement 	Decreases the value of a variable by 1 	--x
    = 	x = 5 	x = 5 	
    += 	x += 3 	x = x + 3 	
    -= 	x -= 3 	x = x - 3 	
    *= 	x *= 3 	x = x * 3 	
    /= 	x /= 3 	x = x / 3 	
    %= 	x %= 3 	x = x % 3 	
    &= 	x &= 3 	x = x & 3 	
    |= 	x |= 3 	x = x | 3 	
    ^= 	x ^= 3 	x = x ^ 3 	
    >>= 	x >>= 3 	x = x >> 3 	
    <<= 	x <<= 3 	x = x << 3
 */
public class Variables {
    public static void main(String[] args) {
        int myInt = 9;

        System.out.println(myInt++);
        System.out.println(--myInt);

        System.out.println(++myInt);
        System.out.println(myInt--);

        System.out.println(myInt>>=3); // 10>>3() -->1
        System.out.println(myInt<<=3); // 10<<3() -->100
    }
}
