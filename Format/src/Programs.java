
public class Programs {

	public static void main(String[] args) {
		
		Product product = new Product("PS4-Pro",399.9999);
		Person person = new Person("Yang",product);
		System.out.print(person);
		/*when a object "person" needs to be printed (person is not a string),
		 * it will trace back to Person class, using "toString* function to 
		 * print out string */
		
	}

}
