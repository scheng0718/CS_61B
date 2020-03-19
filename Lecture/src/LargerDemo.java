/**Demonstrate the creation of a method in java.*/

public class LargerDemo {
	/** Return the larger of x and y. */
	public static int larger(int x, int y) {
		if (x>y) {
			return x;
		}
		return y;
	}
	public static void main(String args []) {
		System.out.println(larger(-10,50));
	}
}


/*
1.We use "public static" to define a function in java.
2.Functions must be declared in a part of class in java, which are called a "method", so in java, all functions are methods.
3.All parameters of a function must have a declared type. 
 
 */
