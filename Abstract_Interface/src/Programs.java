
public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("Ran","29");
		person.printName();
		person.present(); //from Abstract class
		Person.property();
		System.out.println("/////////////////////////////////////////////////////////");
		Animal animal = new Animal();
		animal.test();
	}

}
