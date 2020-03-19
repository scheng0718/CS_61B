public class createTriangle {
	public static void main(String args []) {
		String i="*";
		int x=1;
		for (x=1; x<=5;x++) {	
			if (x==1) {
			System.out.println(i);
		}
			else
				if (x==2) {
					System.out.println(i+i);
				}
				else
					if (x==3) {
						System.out.println(i+i+i);
					}
					else
						if (x==4) {
							System.out.println(i+i+i+i);
						}
						else
							if (x==5) {
								System.out.println(i+i+i+i+i);
							}
		}

	}
}