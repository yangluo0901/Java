import java.util.Arrays;
import java.util.Random;
public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.abs(-26.7));
		System.out.println(Math.ceil(26.7));
		System.out.println(Math.ceil(-26.7));
		System.out.println(Math.floor(26.7));
		System.out.println(Math.floor(-26.7));//negative number makes difference
		System.out.println(Math.pow(2,3));//2^3
		//////////////////////////////////
		///////////Random number:////////
		Random ran = new Random();
		int num;
		for ( int i = 0; i<10; i++)
		{
			num = ran.nextInt(6); //range: num >=0, num <6; 0-5
			System.out.println(num);
		}
		//////////////////////////////////////////////////////////////////////////
		///////////////Array//////////////////////////////////////////////
		int [] array = new int[6];
		System.out.println(Arrays.toString(array));
		array[3] = 10;array[5] = 12;array[0] = 120;
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
	}

}
