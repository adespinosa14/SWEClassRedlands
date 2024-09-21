package HomeworkThree.src;


/** Initialize Linked-List Nodes
 * 
 * @author Andrew Espinosa
 * @version 1.0
 * 
 */
public class Node {
	private Item n;
	private Node next;
	
	/** Initialize Node
	 * 
	 * @see HomeworkThree/src/Item.java
	 * @param Item n
	 * 
	 */
	
	public Node(Item n) {
		this.n = n;
		next = null;
	}
	
	public void printNode(Node head) {
		while(head != null) {}
		System.out.println(head.n);
		head = head.next;
	}
}
