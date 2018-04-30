import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ColorDrawing extends JFrame{
	private JButton button;
	private Color color;
	private Draw drawpanel;
	public ColorDrawing ()
	{
		super("Graphics Color Drawing");
		setSize(400,350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		button  = new JButton("choose color");
		drawpanel =  new Draw();
		Handler handler =  new Handler();
		
		
		drawpanel.setFocusable(true); // in order to make keylistener work
		drawpanel.addKeyListener(handler);
		drawpanel.requestFocus();	 
		
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				color =  JColorChooser.showDialog(null, "Choos Color", Color.BLACK);
				drawpanel.setColor(color);
				drawpanel.repaint();
			}
		});
		add(drawpanel,BorderLayout.CENTER);
		add(button,BorderLayout.SOUTH);
		setVisible(true);
	}
	public class Handler implements KeyListener
	{
		public void keyPressed(KeyEvent e)
		{
			int x = (int) drawpanel.getPosition()[0];
			System.out.println(drawpanel.getLocation().getX());
			int y =  (int)drawpanel.getPosition()[1];
			System.out.println(y);
			System.out.println("I pressed a key " );
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
			{
				System.out.println("down");
				y+=5;
			}else if(e.getKeyCode() == KeyEvent.VK_UP)
			{
				System.out.println("up");
				y-=5;
			}else if(e.getKeyCode() == KeyEvent.VK_LEFT)
			{
				System.out.println("left");
				x-=5;
			}else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
			{
				System.out.println("right");
				x+=5;
			}
			
			drawpanel.setLocation(x,y);
			drawpanel.repaint();
		}
		public void keyReleased(KeyEvent e)
		{
			
		}
		public void keyTyped(KeyEvent e)
		{
			
		}
	}
}
