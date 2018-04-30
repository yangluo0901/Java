import javax.swing.*;
import java.awt.*;
public class MyPanel extends JPanel {
	private int x = 50;
	private int y = 50;
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawString("I am testing the slider", x,y);
		
	}
	public void setPosition(int x, int y)
	{
		this.x = x;
		this.y = y;
		this.repaint();
	}
	
	
}
