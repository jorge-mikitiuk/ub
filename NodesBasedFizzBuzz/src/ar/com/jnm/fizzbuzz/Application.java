package ar.com.jnm.fizzbuzz;

/**
 * @author Jorge Nicolás Mikitiuk
 * <br/>NodesBasedFizzBuzz - 2018-03-13
 */
public class Application {
	
	/**
	 * This applications prints numbers from 0 up to 100, but when the number is
	 * divisible by 3 prints "fizz" and when the number is divisible by 5 prints
	 * "buzz".
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Node first= new ListFactory().buildList(); 
		
		for(int i=0; i<= 100; i++) {
			first.getContent().print(i);
			first= first.getNext();
		}
	}
}
