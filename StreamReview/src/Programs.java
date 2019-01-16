import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/////////create a new file///////////
		File review = new File("review.txt");
		if(review.exists())
		{
			System.out.println("review.txt already exists ... ");
		}
		else
		{
			try {
				review.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.print("error ...");
			}
		}
		////////////////// write something to the review.txt/////////////////////////
		
		/////using bytestream output/input/////////////////
		Scanner scan =  new Scanner(System.in);
		try {
			BufferedOutputStream bostream =  new BufferedOutputStream(new FileOutputStream(review,true));
			
			System.out.println("type the content you want to write into the review.txt ...");
			String str = scan.nextLine();
			bostream.write(str.getBytes());
			bostream.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		///////////using charstream writer/reader/////////////////////
		try {
			BufferedWriter bwriter =  new BufferedWriter(new FileWriter(review,true));
			System.out.println("type the birthday to write into the review.txt ...");
			String str1 =  scan.nextLine();
			bwriter.write(str1);
			bwriter.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/////////////////////read from a file///////////////////
		try
		{
			BufferedInputStream bistream = new BufferedInputStream(new FileInputStream(review));
			int temp ;
			while((temp = bistream.read()) !=-1)
			{
				System.out.print((char)temp);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
