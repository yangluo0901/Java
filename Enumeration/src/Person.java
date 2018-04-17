
public enum Person {
	Yang("male","26"),
	Ran("female","29"),
	Biscuit("female","6");
	// three objects above are what the Person are going to have
	 final String gender;
	 final String age;
	 Person(String gender, String age)//will create create those objects inside class
	{
		this.gender = gender;
		this.age = age;
	}
	 public String getGender()
	 {
		 return gender;
	 }
	
	 public String getAge()
	 {
		 return age;
	 }
	 
	 

}
/* enum is a special type, it can has method inside */
