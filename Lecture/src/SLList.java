public class SLList {
	public static class IntNode {
		public int item;
		public IntNode next;

		public IntNode (int i, IntNode n) {
			item =i;
			next =n;	
		}
	}
	//The first item (if it exists) is at sentinel.next.
	private IntNode sentinel;
	private int size;
	/**Creates an empty SLList. */
	public SLList () {
		sentinel = new IntoNode(63,null);
		size=0;
	}

	//Constructor
	public SLList(int x) {
		sentinel = new IntNode(63, null);
		sentinel.next= new IntNode(x,null);
		size =1;
	}

	//Add an item (new method) to the front of the list.
	public void addFirst(int x){
		sentinel.next = new IntNode(x, sentinel.next);
		size +=1;
	}

	//Return the first item in the list. 
	public int getFirst() {
		return sentinel.next.item;
	}

	 //Add an item to the end of the list
	public void addLast(int x) {
		size +=1;

		/**
		if (first ==null) {
			first = new IntNodex,null);
		return;
		}
		*/

		IntNode p = sentinel;

		//Advance p to the end of the list
		while (p.next != null) {
			p=p.next;
		}
		p.next= new IntNode(x, null);
	}
	/**
	private static int size(IntNode p) {
		if (p.next =null) {
			return 1;
		}
		return 1+size(p.next);
	}
	*/
	
	public int size() { 
		return size;
	}

	public static void main(String[] args) {
		/*Creates a list of one integer, namely 10*/
		SLList L = new SLList(15);
		L.addFirst(10);
		L.addFirst(5);
		L.addLast(20);
		System.out.print(L.size());
	}
}

 