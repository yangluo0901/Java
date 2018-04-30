import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame {
	private MyPanel panel;
	private JButton button;
	private int x;
	private int y;
	public MyFrame()
	{
		super("NotePad");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel =  new MyPanel();
		
		button =  new JButton("Take Notes");
		Handler handler =  new Handler();
		button.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						panel.addMouseMotionListener(handler);
					}
				});
		add(panel,BorderLayout.CENTER);
		add(button,BorderLayout.SOUTH);
		setVisible(true);
	}
	public class Handler extends MouseMotionAdapter
	{
		public void mouseDragged(MouseEvent e)
		{
			x = e.getX();
			y = e.getY();
			System.out.printf("new point :( %d ,%d) \n",x,y);
			panel.setAxes(x,y);
			panel.repaint();
			
		}
	}
}
