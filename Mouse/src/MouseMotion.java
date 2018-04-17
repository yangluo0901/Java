import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;


public class MouseMotion extends JFrame{
	private JPanel mpanel;
	private JLabel label;
	
	public MouseMotion()
	{
		super("Mouse Motion");
		mpanel = new JPanel();
		mpanel.setPreferredSize(new Dimension(40,40));
		mpanel.setBackground(Color.BLUE);
		setSize(300,300);
		setVisible(true);
//		setResizable(false);
		setLayout(new GridLayout(2,1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Handler handler = new Handler();
		mpanel.addMouseListener(handler);
		mpanel.addMouseMotionListener(handler);
		label = new JLabel("Default",JLabel.CENTER);
		add(label,BorderLayout.NORTH);
		add(mpanel,BorderLayout.CENTER);
		
		
	}
	private class Handler implements MouseListener,MouseMotionListener
	{
		public void mouseClicked(MouseEvent e)
		{
			label.setText(String.format("I clicked the panel at %d %d...",e.getX(),e.getY()));
		}
		public void mousePressed(MouseEvent e)
		{
			label.setText(String.format("I pressed the panel at %d %d...",e.getX(),e.getY()));
		}
		public void mouseEntered(MouseEvent e)
		{
			mpanel.setBackground(Color.RED);
		}
		public void mouseReleased(MouseEvent e)
		{
			label.setText(String.format("I released the panel at %d %d...",e.getX(),e.getY()));
		}
		public void mouseExited(MouseEvent e)
		{
			mpanel.setBackground(Color.BLUE);
		}
		public void mouseDragged(MouseEvent e)
		{
			label.setText(" you are dragging mouse");
		
		}
		public void mouseMoved(MouseEvent e)
		{
			label.setText(" you are moving mouse");
			
		}
	}
}
