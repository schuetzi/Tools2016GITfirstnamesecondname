public class DLNode {
	
	/** Reference to the next element in the list, or null if it is the last */
	public DLNode next;
	
	/** Reference to the previous element in the list, or null if it is the first */
	public DLNode prev;
	
	/** Holds the actual data */
	public int val;
	
	/** to initialize a node */
	public DLNode(int val) {
		DLNode node = new DLNode();
		this.val = val;
	}
	public void thisIsANewMethod() {
		int a = 1;
	}
}
