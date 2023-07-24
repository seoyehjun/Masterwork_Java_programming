import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num6 extends JFrame
{
	MyPanel panel = new MyPanel();
	public num6()
	{
		setTitle("기하학");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		setContentPane(panel);
		
		setVisible(true);
		setSize(500,400);
	}
	class MyPanel extends JPanel
	{
		public MyPanel()
		{
			
		}
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			System.out.print("학인");
			for(int i=1;i<=9;i++)
			{
				System.out.println("this.getWidth():"+this.getWidth());
				g.drawLine(this.getWidth()/10*i , 0 , this.getWidth()/10*i , this.getHeight());
				g.drawLine(0 ,this.getHeight()/10*i , this.getWidth() , this.getHeight()/10*i);
			}
		}
	}
	public static void main(String[] args) 
	{
		new num6();

	}
}
