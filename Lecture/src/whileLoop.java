
public class whileLoop {
	public static int whileSum(int[]a) {
		int i=0;		//initialization
		int sum=0;		
		while (i<a.length) {	//termination	
			sum=sum+a[i];		
			i++;				//increment
		}
		return sum;
	}
}
	
	/*
	1. initialization of a feature
	2. begins the loop by checking for a termination condition
	3. ends with an increment operation.
	4. thus it was born the for loop. 
	*
	*/