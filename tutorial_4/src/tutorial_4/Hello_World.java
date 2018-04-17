package tutorial_4;
import java.util.Scanner;
public class Hello_World {
	public static void main (String args [])
	{
		Scanner scan =new Scanner(System.in);//System.in stands for system input
		System.out.println("Please type the first number");
		double a =  scan.nextDouble();
		System.out.println("Please type the second number");
		double b =  scan.nextDouble();
		System.out.println("Calculating ...");
		double c = a + b;
		scan.close();
		Person person = new Person("Yang", 26);
		System.out.println(person.name + " is calculating and reuslt is "+c);
		System.out.printf("%-10s is calculating and result is %e",person.name,c);
	}
}
