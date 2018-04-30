import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.*;

public class Draw extends JPanel {
	private Color color = Color.BLACK;
	private int x =100;;
	private int y =100;
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(color);
		g.drawString("I am learning Graphics Drawing...", x, y);
	}
	public void setColor(Color color)
	{
		this.color = color;
		
	}
	public void setLocation(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public int[] getPosition()
	{
		return new int[] {x,y};
	}
}
