public class ContinueDemo {
	public static void main(String []args) {
		String []a= {"Oyster", "Stinky tofu","Squid", "tofu pudding"};
		for (int i=0; i<a.length;i++) {
			if(a[i].contains("tofu")) {
				continue;
			}
			for(int j=0;j<5;j++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
			
		}	
	}
}
