/* Exercise 1.1.2
 * print out the cumulative sum of the integers from 0 to 9
 * start with 0 1 3 6 10...45
 */

public class HelloNumber {		
	public static void main(String args[]) {
		//declare
		int x=0;
		int sum=0;
		while (x<10) {
			sum=sum+x;
			x=x+1;
			System.out.println(sum);
		}
	
	}
}
