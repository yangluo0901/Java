import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MoveList extends JFrame {
	public JList<String> left;
	public JList<String> right;
	public JButton toright;
	public JButton toleft;
	public JLabel label;
	public DefaultListModel<String> rightmodel;
	public DefaultListModel<String> leftmodel;
	public MoveList()
	{
		super("Move List");
		setLayout(new FlowLayout());
		setSize(300,200);
		setLocation(100,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		String [] teams = {"Spurs","Lakers","Rockets","Sixer","Celtics","King","Warriors"};
		leftmodel =  new DefaultListModel<String>();
		for (String x : teams)
		{
			leftmodel.addElement(x);
		}
		left = new JList<String>(leftmodel);
		left.setVisibleRowCount(4);
		add(new JScrollPane(left));
		toright =  new JButton("Move to right");
		toleft =  new JButton("Move to left");
		add(toright);add(toleft);
		rightmodel =  new DefaultListModel<String>();
		right =  new JList<String>();
		right.setFixedCellWidth(100);
		right.setFixedCellHeight(10);
		add(new JScrollPane(right));
		//////Add listener////////////
		toright.addActionListener(
				new ActionListener()
				{
					
					public void actionPerformed(ActionEvent e)
					{	
						
						for (String x : left.getSelectedValuesList())
						{
							rightmodel.addElement(x);
							leftmodel.removeElement(x);
						}
//						String[] array = new String[left.getSelectedValuesList().size()];
//						right.setListData(left.getSelectedValuesList().toArray(array));
						right.setModel(rightmodel);
						left.setModel(leftmodel);
					}
				});
		toleft.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						for (String x : right.getSelectedValuesList())
						{
							leftmodel.addElement(x);
							rightmodel.removeElement(x);
						}
//						String[] array = new String[left.getSelectedValuesList().size()];
//						right.setListData(left.getSelectedValuesList().toArray(array));
						right.setModel(rightmodel);
						left.setModel(leftmodel);
					}
				});
		
		
	}
}
