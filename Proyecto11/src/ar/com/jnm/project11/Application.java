package ar.com.jnm.project11;

/**
 * @author Jorge Nicolás Mikitiuk
 * <br/>Proyecto11 - 2018-03-18
 */
public class Application {

	public static void main(String[] args) {
		CEO ceo = new CEO();
		ceo.setSurname("Burns");
		Secretary secretary= new Secretary();
		secretary.setSurname("Smithers");
		ceo.setSecretary(secretary);
		secretary.setCeo(ceo);
		
		System.out.println(ceo.getSecretary().getSurname());
		System.out.println(secretary.getCeo().getSurname());
		
		Employee employeeHomer = new Employee();
		employeeHomer.setName("Homer");
		employeeHomer.setSurname("Simpson");
		
		Boss boss = new Boss();
		Employee[] employees= new Employee[] {employeeHomer};
		boss.setEmployees(employees);
		
		ceo.setBosses(new Boss[] {boss});
	}

}
