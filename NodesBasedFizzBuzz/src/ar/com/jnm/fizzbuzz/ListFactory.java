package ar.com.jnm.fizzbuzz;

/**
 * @author Jorge Nicolás Mikitiuk
 * <br/>NodesBasedFizzBuzz - 2018-03-13
 * <br/>This class builds the list of printers
 */
public class ListFactory {
	public Node buildList() {
		Node first= new Node(new StringPrinter("FizzBuzz"));
		Node last= addNode(first, new NumberPrinter());
		last= addNode(last, new NumberPrinter());
		last= addNode(last, new StringPrinter("Fizz"));
		last= addNode(last, new NumberPrinter());
		last= addNode(last, new StringPrinter("Buzz"));
		last= addNode(last, new StringPrinter("Fizz"));
		last= addNode(last, new NumberPrinter());
		last= addNode(last, new NumberPrinter());
		last= addNode(last, new StringPrinter("Fizz"));
		last= addNode(last, new StringPrinter("Buzz"));
		last= addNode(last, new NumberPrinter());
		last= addNode(last, new StringPrinter("Fizz"));
		last= addNode(last, new NumberPrinter());
		last= addNode(last, new NumberPrinter());
		last.setNext(first);
		return first;
	}
	
	private Node addNode(Node last, Printer content) {
		Node aux= new Node(content);
		last.setNext(aux);
		return aux;
	}

}
