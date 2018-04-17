
public class Person {
	public String name;
	public Product product;
	public Person(String name, Product product)
	{
		this.name = name;
		this.product = product;
		System.out.printf("this is product %s",this);
	}
	public String toString()
	{
		return String.format("%s and price is %s",name,product);
	}
}
