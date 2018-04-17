import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyAdapter extends JFrame{
	private JLabel label;
	public MyAdapter()
	{
		super("learning Adapter Class");
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		label = new JLabel("I clicked 0 times ...");
		add(label);
		label.addMouseListener(new Adapter());
	}
	public class Adapter extends MouseAdapter 	// using MouseAdapter, instead of MouseListener, so that we don't need to override all abstract methods in the interface
												// note that we are using extends, since MouseAdapter is a build-in class that implements MouseListener interface and override
												// all abstract methods with empty method.
	{
		public void mouseClicked(MouseEvent e)
		{
			String str = String.format("I clicked %d times", e.getClickCount());
			if(e.isMetaDown())
			{
				str += "with right button";
			}else if(e.isAltDown())
			{
				str += "with center scroll";
			}else
			{
				str += "with left button";
			}
			label.setText(str);
		}
	}
}
