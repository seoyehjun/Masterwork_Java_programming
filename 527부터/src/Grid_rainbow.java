 import javax.swing.*;
 import java.awt.*;
 
public class Grid_rainbow extends JFrame 
{
	public Grid_rainbow()
	{
		Color rainbow[] = {Color.red, Color.orange , Color.yellow , Color.green , Color.blue,
						   Color.blue , Color.pink , Color.cyan , Color.gray , Color.green , Color.cyan ,
						   Color.white , Color.lightGray , Color.pink , Color.yellow , Color.orange};
		setTitle("4*4colorFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4,4);
		Container c = getContentPane();
		c.setLayout(grid);
		
		for(int i=0; i<=15; i++)
		{
			JButton temp = new JButton(""+i);
			temp.setBackground(rainbow[i]);
			c.add(temp);
		}
		
		setSize(600,300);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new Grid_rainbow();

	}
}
