import javax.swing.*;
import java.awt.*;

public class JLabel_test extends JFrame
{

	public JLabel_test()
	{
		
		Container c = getContentPane();
		c.setLayout(null);
		JLabel label[] = new JLabel[20];
		
		for(int i=0;i<20;i++)
		{
			label[i] = new JLabel();
		}
		
		for(int i=0;i<20;i++)
		{
			int x = (int)(Math.random()*200) + 50;
			int y = (int)(Math.random()*200) + 50;
			
			label[i].setBackground(Color.cyan);
			label[i].setLocation(x,y);
			label[i].setSize(10,10);
			label[i].setOpaque(true);
			c.add(label[i]);
		}
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new JLabel_test();
	}


}

