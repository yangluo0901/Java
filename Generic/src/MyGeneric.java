
public class MyGeneric <T extends Animal>{ //define a constraints on what type of parameters can be used
	private T property;
	public MyGeneric (T t)
	{
		this.property = t;
	}
	public <T> void print()
	{
		System.out.println(property.name);
	}
}
