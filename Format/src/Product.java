
public class Product {
	public String name;
	public double price;
	public Product(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	public String toString()
	{
		return String.format("%s, price is %.2f",name,price);
	}
}
