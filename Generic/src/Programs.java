
public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal cat  =  new Animal("kitty","red");
		Animal dog =  new Animal("doggie","black");
		Person yang = new Person("yang","gender");
		MyGeneric cat_g = new MyGeneric(cat);
		// MyGeneric yang_g = new MyGeneric(yang); can not be used
		cat_g.print();
	}

}
