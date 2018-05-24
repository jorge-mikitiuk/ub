package ar.com.jnm.fizzbuzz;

/**
 * @author Jorge Nicolás Mikitiuk
 * <br/>NodesBasedFizzBuzz - 2018-03-13
 * <br/>This class represents a node of a list that contains a printer
 */
public class Node {

	private Node next;

	private Printer content;

	/**
	 * 
	 * @param content the printer
	 */
	public Node(Printer content) {
		setContent(content);
	}

	public boolean hasNext() {
		return next != null;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Printer getContent() {
		return content;
	}

	private void setContent(Printer content) {
		this.content = content;
	}
}
