import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ItemEvent;
import java.util.List;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class JCombo extends JFrame {
	private JLabel label_1;
	private JLabel label_2;
	private JComboBox<String> jcb;
	private JList<String> jl;
	public JCombo()
	{
		super("JComboBox & Drop-down List");
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200,100);
		setLayout(new GridLayout(3,2));
		label_1 = new JLabel("Dojo Location:");
		label_2 = new JLabel("Favorite Languate:");
		String [] locations = {"Los Angeles","Washington D.C","New York", "Seattle"};
		String [] languages = {"Python","C#","Java","Ruby","JavaScript","C++","HTML","CSS"};
		jcb = new JComboBox<String>(locations);
		jl = new JList<String>(languages);
		jl.setVisibleRowCount(3);
//		jl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane jsp = new JScrollPane(jl);
		
		add(label_1);add(jcb);
		add(label_2);add(jsp);
		
		jcb.addItemListener(new ItemHandler());
		jl.addListSelectionListener(new ListSelectionListener()
				{
					public void valueChanged(ListSelectionEvent e)
					{
						String str ="";
						
//	Single selection:	String str = jl.getSelectedValue();
						// if multiple selections
						List<String> obj =  jl.getSelectedValuesList();
						for(Object x : obj)
						{
							str+=(String)x;
						}
						JOptionPane.showMessageDialog(null,str,"Selected",JOptionPane.INFORMATION_MESSAGE);
					}
				});
//		jsp.addAnctionListener(handler);
		
	}
	public class ItemHandler implements ItemListener
	{
		String str = "";
		public void itemStateChanged(ItemEvent e)
		{
			if (e.getStateChange() == ItemEvent.SELECTED)
			{
				System.out.print((String)jcb.getSelectedItem());
				str = "Dojo Location is " + (String)e.getItem();
				JOptionPane.showMessageDialog(null,str,"Selected",JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
		
	}
}
