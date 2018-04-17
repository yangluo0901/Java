
public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal =  new Animal();
		Animal dog =  new Dog();
		Animal cat =  new Cat();
		Cat cattie = new Cat();
		animal.speak();
		dog.speak();
		cat.speak();
		cattie.speak(20);
		//at compile time, JVM would invoke speak method inside Animal class, that is why we can NOT use cat.speak(20), since at compile time,
		// JVM would search speak(20) in side Animal class which does not exist.
		//however,during the runtime, JVM would invoke the speak method in dog, cat class
		animal.test(cattie);// not that test method inside class Animal not only accepts Food type but also the subclass of the Food
	}

}
