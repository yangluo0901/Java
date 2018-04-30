import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
public class MyPanel extends JPanel{
	private List<List<Integer>> location;
	private List<Integer> spot;
	
	public  MyPanel()
	{
		 location =  new ArrayList<List<Integer>>();
		 
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
//		location =  new ArrayList<List<Integer>>();
		 System.out.println("location is " + location);
		 System.out.println("location size is " +location.size());
//		System.out.print(location.size());
		
		for(int i =0; i < location.size(); i++)
		{
			System.out.println("");
//			System.out.printf("( %d, %d ) \n",location.get(i).get(0),location.get(i).get(1));
			
			g.drawLine(location.get(i).get(0), location.get(i).get(1), location.get(i).get(0), location.get(i).get(1));
		}
		
		
	}
	public void setAxes(int x, int y)
	{
		spot =  new ArrayList<Integer>();
		spot.add(x);
		spot.add(y);
		System.out.printf("before add point, location is %s \n", location);
		location.add(spot);
		System.out.printf("after add point, location is %s \n", location);
	}
}
