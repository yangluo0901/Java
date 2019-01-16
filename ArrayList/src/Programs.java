import java.util.*;
public class Programs {
	
	public static void main(String[] args)
	{
		String [] champs = {"Lee sin","Caitlyn","Lux","Ekko","Thresh","Nidalee"};
		List<String> list_1 = new ArrayList<String>();
		for ( String champ : champs)
		{
			list_1.add(champ);
		}
		ListIterator<String> iter = list_1.listIterator();
		System.out.println(list_1);
		while(iter.hasNext()) // hasNext(),start from index 0, if more elements detected, then return true
		{
			
			System.out.printf("%d : %s \n",iter.nextIndex(), iter.next());
		}
		                    /*Element(0)   Element(1)   Element(2)   ... Element(n-1)
		cursor positions:  ^            ^            ^            ^                  ^
		next(), return the element next to the current cursor position and advance the cursor position forward
		nextIndex(), return the the index of the element next to current cursor position
		// Iterate backward
*/		System.out.println("\n  Iterating backward ... \n");
		while(iter.hasPrevious())
		{
			System.out.printf("%d : %s \n",iter.previousIndex(), iter.previous());
		}
		//convert list back to array
		String [] array =  list_1.toArray(new String[list_1.size()]);
		System.out.println("array is ");
		for( String str : array)
		{
			System.out.printf("   %s",str);
		}
		
		// add element
		list_1.add(2,"Garen");
		System.out.print("\n");
		System.out.println(list_1);
		//remove element
		list_1.remove(2);// or list_1.remove("Garen");
		System.out.println(list_1);
		// remove part of list
		list_1.subList(1, 3).clear();
		System.out.println(list_1);
		//reverse method_1:
		Collections.reverse(list_1);
		System.out.println(list_1);
		List<Integer> list_2 = new ArrayList<Integer> (Arrays.asList(13,9,45,46,5,100,99));
		//sort
		Collections.sort(list_2);
		System.out.println(list_2);
		//reverse sort
		Collections.sort(list_2, Collections.reverseOrder());
		System.out.println(list_2);
		//search and get frequency
		int num = Collections.frequency(list_1,"Lee sin");
		System.out.println(num);
		System.out.printf("%s ",list_1);
		List<List<Integer>> multi =  new ArrayList<List<Integer>>();
		
		List<Integer> row_1 =  new ArrayList<Integer>(Arrays.asList(1,3,5,7));
		List<Integer> row_2 =  new ArrayList<Integer>(Arrays.asList(2,4,6,8));
		multi.add(row_1);
		multi.add(row_2);
		System.out.println(multi);
		System.out.println(multi.size());
		System.out.println(multi.get(0).get(1));
		
		
		
	}
	
	
}
