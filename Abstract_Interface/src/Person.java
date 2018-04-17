
public class Person extends AbstractClass {
	public Person()
	{
		super("Yang","27");
	}
	public Person(String name, String age)
	{
		super(name,age);
	}
	public void printName() 
	{
		System.out.println(" I am defining method printName from AbstractClass ...");
	}
	public void printAge() 
	{
		System.out.println(" I am defining method printAge from AbstractClass ...");
	}
}
