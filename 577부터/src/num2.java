import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num2 extends JFrame
{
	Container c = getContentPane();
	public num2()
	{
		setTitle("µå·¹±ëÇØº¸Àð");
		
		c.setLayout(null);
		c.setBackground(Color.green);
		c.addMouseMotionListener(new MyListener());
		c.addMouseListener(new MyListener2());
		
		setVisible(true);
		setSize(300,200);
	}
	
	class MyListener extends MouseMotionAdapter
	{
		public void mouseDragged(MouseEvent e)
		{
			c.setBackground(Color.yellow);
		}
	}
	class MyListener2 extends MouseAdapter
	{
		public void mouseReleased(MouseEvent e)
		{
			c.setBackground(Color.green);
		}
	}
	public static void main(String[] args)
	{
		new num2();

	}
}
