
public class Programs {
	public static void main (String[] args)
	{
		String a = "yang";
		String b = "ran";
		String c = "RAN";
		Person yang =  new Person("yang","male");
		Person ran = new Person("ran","female");
		Person ran_1 =  new Person("ran","female");
		if ( a == b)
		{
			System.out.println("== compares type ...");
			
		}else if (a.equals("yang"))
		{
			System.out.println("equals compares the content ...");
		}else if (a == "yang")
		{
			System.out.println("== also compares content ...");
		}
		
		if( yang == ran)
		{
			System.out.println("== compares type ...");
		}else if(ran_1 == ran)
		{
			System.out.println("== compares content ...");
		}
		if(yang.equals(ran))
		{
			System.out.println("equals compares type ...");
		}
		else if(ran_1.equals(ran))
		{
			System.out.println("equals compares content ...");
		}
		
		
	}
}
