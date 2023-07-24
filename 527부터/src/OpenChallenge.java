import javax.swing.*;
import java.awt.*;

public class OpenChallenge extends JFrame 
{
	public OpenChallenge()
	{
		Container c = getContentPane();
		BorderLayout border = new BorderLayout(10,10);
		c.setLayout(border);
		
		c.add(new NorthPanel(),BorderLayout.NORTH );
		c.add(new CenterPanel(),BorderLayout.CENTER );
		
		
		setSize(300,300);
		setVisible(true);
	}


	public static void main(String args[])
	{
		new OpenChallenge();
		
	}

}

	class NorthPanel extends JPanel
	{
		public NorthPanel()
		{
			setLayout(new FlowLayout());
			setBackground(Color.LIGHT_GRAY);
			add(new JButton("Open"));
			add(new JButton("Read"));
			add(new JButton("Close"));
		}
	}

	class CenterPanel extends JPanel
	{
		public CenterPanel()
		{
			setLayout(null);
			setBackground(Color.LIGHT_GRAY );
			
			JLabel label1 = new JLabel("Hello");
			label1.setLocation(100,150);
			label1.setSize(50,50);
			
			JLabel label2 = new JLabel("Love");
			label2.setLocation(140,20);
			label2.setSize(50,50);
			
			JLabel label3 = new JLabel("Java");
			label3.setSize(50,50);
			label3.setLocation(230,100);
		
			add(label1);
			add(label2);
			add(label3);
		}
	}