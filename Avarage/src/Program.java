import java.util.ArrayList;
import java.util.Scanner;
public class Program {
	public static void main (String args[])
	{
		Scanner scan = new Scanner(System.in);
		double sum = 0;
		int count = 0;
		while(true)
		{
			System.out.println("please type in a number: (or 'yes' to stop)");
			String input = scan.nextLine();
			
			if (! input.equals("yes"))
			{
				double num = Double.parseDouble(input);
				sum +=num;
				count += 1;
			}
			else
			{
				break;
			}
		}
		scan.close();
		double avg = sum / count;
		System.out.println(avg);	
	}
	
}
