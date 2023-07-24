import javax.swing.*;
import java.awt.*;

public class Rainbow extends JFrame
{
	public Rainbow()
	{
		Color rainbow[] = {Color.red,Color.orange ,Color.yellow ,Color.green ,Color.blue,
				Color.blue,Color.pink,Color.cyan ,Color.gray,Color.green};
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(1,10);//·¹ÀÌ¾Æ¿ô
		
		Container c = getContentPane();
		c.setLayout(grid);
		
		for(int i=0 ;i<10;i++)
		{
			JButton temp = new JButton(""+i);
			temp.setBackground(rainbow[i]);
			c.add(temp);
		}
		
		setSize(600,250);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Rainbow();
	}

}
