public class createTriangle1 {
	public static void main(String args[]) {
		int row = 0;
		int col = 0;
		int SIZE = 6;
		
		for (row=0; row<SIZE; row++) {
			for(col=0; col<SIZE;col++) {
				if (col<=row) {
				System.out.print("*");
				}
			}
			System.out.println();
		}	
	}	
}