import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.*;
public class Frame_1  extends JFrame {
	public JPanel panel_1;
	public JPanel panel_2;
	public JPanel panel_3;
	public JLabel label_1;
	public JLabel label_2;
	public JLabel label_3;
	public JTextField first_name;
	public JTextField last_name;
	public JPasswordField password;
	public JButton reg;
	public JButton log;
	///////////////////////////////JRadiobutton////////////////////////////////////////////
	public Font f1;
	public Font f2;
	public Font f3;
	public Font f4;
	public JTextField font_test;
	public JRadioButton jb1;
	public JRadioButton jb2;
	public JRadioButton jb3;
	public JRadioButton jb4;
	public ButtonGroup bgroup;// make a group of button in which only one button can be selected
	public Frame_1()
	{
		setTitle("hahaah");//  equals super("hahaah")
		setLayout(new GridLayout(3,1));
		this.setSize(380,320);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(true);
		panel_1 = new JPanel();
		panel_1.setLayout(new GridLayout(4,2));
		label_1 = new JLabel("First Name:");
		label_2 = new JLabel("Last Name:");
		label_3 = new JLabel("Password:");
		first_name = new JTextField(2);
		last_name = new JTextField(2);
		password = new JPasswordField(2);
		Class c = label_1.getClass();
//		Icon a = new ImageIcon(getClass().getResource("/images.png"));
		////////////////////////////////////////////////////////////////////////////////////////////////
		//////////////RESIZE THE ICON/////////////////////////////////////////////////
		Image temp = null;
		try {
			 temp = ImageIO.read(new File("C:/Users/yluo/Desktop/CS Job/images.png"));
			
		}catch(IOException e)
		{
			System.out.println("error");
		}
		
		Image aftersize = temp.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		Icon a = new ImageIcon(aftersize);
		System.out.println("getClass is" +getClass());
		
//		Image img = ImageIO.read(new File("C:/Users/yluo/Desktop/CodingDojo/Java/GUI/src/facebook.png"));
		ImageIcon icon =  new ImageIcon(getClass().getResource("/facebook.png"));
		Image img = icon.getImage();
		BufferedImage bi = new BufferedImage(20,20,BufferedImage.TYPE_INT_ARGB);
		System.out.println(img.getWidth(null));
		Graphics g =bi.createGraphics();
		g.drawImage(img, 3, 3, 20,20, null, null);
		Icon b = new ImageIcon(bi);
		reg = new JButton("Register",a);
		reg.setRolloverIcon(b);
		log = new JButton("Login");
		panel_1.add(label_1);panel_1.add(first_name);
		panel_1.add(label_2);panel_1.add(last_name);
		panel_1.add(label_3);panel_1.add(password);
		panel_1.add(log); panel_1.add(reg);
		add(panel_1);
		Handler handler = new Handler();
		log.addActionListener(handler);
		reg.addActionListener(handler);
		first_name.addActionListener(handler);
		//JRadioButton
		panel_2 = new JPanel();
		panel_3 = new JPanel();
		font_test =  new JTextField("I am testing JRadioButton",20);
		jb1 = new JRadioButton("St.Louis",true);
		jb2 = new JRadioButton("San Antonio",false);
		jb3 = new JRadioButton("Newark",false);
		jb4 = new JRadioButton("Los Angeles",false);
		panel_3.add(font_test);
		panel_2.add(jb1);
		panel_2.add(jb2);
		panel_2.add(jb3);
		panel_2.add(jb4);
		add(panel_3);
		add(panel_2);
		
		bgroup = new ButtonGroup();
		bgroup.add(jb1);
		bgroup.add(jb2);
		bgroup.add(jb3);
		bgroup.add(jb4);
		f1 = new Font("TimesRoman",Font.PLAIN,14);
		f2 = new Font("Alisha",Font.BOLD,14);
		f3 = new Font("Sheila",Font.ITALIC,14);
		f4 = new Font("calibri",Font.BOLD + Font.ITALIC,14);
		font_test.setFont(f1);
//		jb1.addItemListener(new ItemHandler(f1));
//		jb2.addItemListener(new ItemHandler(f2));
//		jb3.addItemListener(new ItemHandler(f3));
//		jb4.addItemListener(new ItemHandler(f4));
		jb1.addActionListener(new Handler(f1));
		jb2.addActionListener(new Handler(f2));
		jb3.addActionListener(new Handler(f3));
		jb4.addActionListener(new Handler(f4));
		//Can use both Itemlistener and ActionListener
		
	}
	public class Handler implements ActionListener
	{
		private Font font;
		private	Handler()
		{
			this.font = f1;
		}
		
		private	Handler(Font font)
		{
			this.font = font;
		}
		
		public void actionPerformed(ActionEvent e)
		{
			String str = "";
			if (e.getSource() == reg)
			{
				str = "you are going to registeration page...";
			}
			else if (e.getSource() == first_name)
			{
				str = e.getActionCommand();
			}
			else if(e.getSource() == log)
			{
				str="you are logging in ...";
			}
			else
			{
				font_test.setFont(font);
				str="set test into"+font.getFontName();
			}
			
			JOptionPane.showMessageDialog(null,str,"Display",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public class ItemHandler implements ItemListener
	{
		private Font font;
		private ItemHandler(Font font)
		{
			this.font = font;
		}
		public void itemStateChanged(ItemEvent event)
		{
			font_test.setFont(font);
		}
	}
}
