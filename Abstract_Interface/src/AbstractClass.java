
public abstract class AbstractClass {
	private String name;//private,protected
	public String age;
	public abstract void printName();
	abstract void printAge();// abstract member in abstract class can only be public and protected
	public AbstractClass(String name, String age)//Constructor
	{
		this.name = name;
		this.age = age;
	}
	public void present()
	{
		System.out.printf("name is %s and age is %s \n",name,age);
	}
	public String getName()
	{
		return name;
	}
	public static void property()//Abastract can have static and non-static
	{
		System.out.println("I am a human !");
	}
}
