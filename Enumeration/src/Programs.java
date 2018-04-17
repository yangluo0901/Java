import java.util.Arrays;
import java.util.EnumSet;

public class Programs {
	public static void main(String [] args)
	{
		System.out.println(Arrays.deepToString(Person.values()));
		//line above returns [Yang, Ran, Biscuit], in which three of them are OBJECTS, so we can do :
		System.out.println(Person.values()[0].getGender());
		for (Person entry : Person.values())
		{
			System.out.printf("name is %s,gender is %s, %s years-old \n",entry,entry.getGender(),entry.getAge());
		}
		System.out.println("////////////////////////////////////////////////////////");
		for (Person entry : EnumSet.range(Person.Ran, Person.Biscuit))
		{
			System.out.printf("name is %s,gender is %s, %s years-old \n",entry,entry.getGender(),entry.getAge());
		}
		//
	
	
	}
}
