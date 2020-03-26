public class IntList {
	public int first;
	public IntList rest;

	public IntList (int f, IntList r) {
	first =f;
	rest =r;	
	}

	/** Return the size of the list using recursion*/
	public int size(){
		if (rest==null) {
			return 1;
		}
		return 1 + this.rest.size();
	}
	/**Retun the size of the list without using recursion */
	public int iterativeSize(){
		InList p=this;
		int totalSize=0;
		while (p!=null) {
			totalSize +=1;
			p=p.size;
		}
		return totalSize; 
	} 

	public int get(int i) {
		if (i==0) {
			return first;
		}
		return rest.get(i-1);
	} 
	

	public static void main(String[] args) {
		IntList L= new IntList(15,null);
		L = new IntList(10,L);
		L = new IntList(5,L);

		System.out.print(L.size());
		System.out.print(L.get());
	}
}
