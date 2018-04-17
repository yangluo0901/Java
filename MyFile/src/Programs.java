import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Formatter;

public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		///////////////////////////////////create new file method 1///////////////////////////////
//		try
//		{
//			Formatter create =  new Formatter("file.txt");
//			System.out.println("new file");
//			
//		}catch(Exception e)
//		{
//			System.out.println("error");
//		}
		/////////////////////////////////////create new file method 2 //////////////////////////////
		File file = new File("text.txt");
		if (file.exists())
		{
			System.out.println("file already exists...");
		}else
		{
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("error.....");
			}
		}
		//////////////////////////////write to file //////////////////////////
		try {
			FileOutputStream outstream =  new FileOutputStream(file);
			////////////////write string method 1///////////////////////////////
			String str = "hello world";
			byte[] str_byte = str.getBytes();
			outstream.write(str_byte);
			outstream.close();
			////////////////write string method 2///////////////////////////////
			BufferedOutputStream bostream = new BufferedOutputStream(new FileOutputStream(file,true)); // true means append
			bostream.write("   Testing bufferedoutputsteam ...".getBytes()); // for byte stream, 
																			//if using char stream " BufferedWriter bw =  new BufferedWriter( new FileWriter(file))"
			bostream.close();
			////////////////write string method 3///////////////////////////////
			FileWriter fw = new FileWriter(file,true);
			fw.append(" i am testing filewriter append");   // for char stream
			fw.close();
			/////////////////////////////read file////////////////////////////////
			BufferedInputStream  bistream =  new BufferedInputStream(new FileInputStream(file));
			File newfile =  new File("newtext.txt");
			if(newfile.exists())
			{
				System.out.println("newfile.text already exists !");
			}else
			{
				newfile.createNewFile();
			}
			BufferedOutputStream bostream_new = new BufferedOutputStream(new FileOutputStream(newfile,true)); 
			while(bistream.read() != -1)
			{
				System.out.println((char)bistream.read());
				bostream_new.write((char)bistream.read());
			}
			bostream_new.close();
			bistream.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
