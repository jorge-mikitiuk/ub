package ar.com.jnm.project10;

public class Application {

	public static void main(String[] args) {
		StringExtension stringExtension = new StringExtension("Hola Mundo Cruel");
		
		System.out.println(stringExtension.subtring("Hola", "Cruel"));
	}

}
