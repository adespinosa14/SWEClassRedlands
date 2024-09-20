public class Node {
	private Item n;
	private Node next;
	
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
