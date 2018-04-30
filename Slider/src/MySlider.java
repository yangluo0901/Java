
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;

import javax.swing.event.ChangeListener;
public class MySlider extends JFrame{
	public JSlider slider_x;
	public JSlider slider_y;
	public MyPanel panel;
	public int x = 50;
	public int y = 50;
	public MySlider()
	{
		super("Slider");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel =  new MyPanel();
		slider_x =  new JSlider(SwingConstants.HORIZONTAL,0,150,50);
		slider_y =  new JSlider(SwingConstants.VERTICAL,0,150,50);
		slider_y.setMajorTickSpacing(50);
		slider_y.setMinorTickSpacing(25);
		slider_y.setPaintTicks(true);
		slider_y.setPaintLabels(true);
		
		slider_x.setMajorTickSpacing(50);
		slider_x.setMinorTickSpacing(25);
		slider_x.setPaintTicks(true);
		slider_x.setPaintLabels(true);
		slider_x.addChangeListener(new ChangeListener()
				{	
					public void stateChanged(ChangeEvent e)
					{
						x = slider_x.getValue();
						System.out.printf("( %d , %d )",x,y);
						panel.setPosition(x ,y);
					}
				});
		slider_y.addChangeListener(new ChangeListener()
			{
				public void stateChanged(ChangeEvent e)
				{
					y = slider_y.getValue();
					System.out.printf("( %d , %d )",x,y);
					panel.setPosition(x ,y);

				}
			});
		
		add(panel,BorderLayout.CENTER);
		add(slider_x,BorderLayout.SOUTH);
		add(slider_y,BorderLayout.WEST);
		System.out.printf("( %d , %d )",x,y);
		setVisible(true);
		
	
	}
}
