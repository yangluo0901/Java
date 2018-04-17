import java.util.Arrays;
import java.util.Random;
public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int [] {1,2,3,4,5};
		System.out.println(Arrays.toString(array));
		int [][] multi = new int [3][4];
		System.out.println(Arrays.deepToString(multi));
		Random rand = new Random();
		for (int row = 0; row <3; row++)
		{
			for(int col = 0; col < 4; col++)
			{
				multi[row][col] = rand.nextInt(10);
				
			}
		}
		System.out.println(Arrays.deepToString(multi));
	}

}
