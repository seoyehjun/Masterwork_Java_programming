import javax.swing.*;
import java.awt.*;

public class ·¿Ã÷½ºÅÍµğÀÚ¹Ù extends JFrame
{
	public ·¿Ã÷½ºÅÍµğÀÚ¹Ù()
	{
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(1,10);
		
		Container c = getContentPane();
		c.setLayout(grid);
		
		for(int i=0 ;i<10;i++)
		{
			c.add(new JButton(""+i));
		}
		
		setSize(600,250);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new ·¿Ã÷½ºÅÍµğÀÚ¹Ù();
	}

}
