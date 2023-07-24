import javax.swing.*;
import java.awt.*;


public class num2 extends JFrame
{
	MyPanel panel = new MyPanel();
	public num2()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		setTitle("¿ø");
		setContentPane(panel);
		
		Thread th = new Thread(new MyThread());
		th.start();
		
		
		setVisible(true);
		setSize(500,500);
	}
	class MyThread extends Thread
	{
		public void run()
		{
			while(true)
			{
				panel.repaint();
				try
				{
					Thread.sleep(400);
				}
				catch(InterruptedException e)
				{
					return;
				}
			}
		}
	}
	//
	class MyPanel extends JPanel
	{
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillArc((int)(Math.random()*400), (int)(Math.random()*400),50,50, 0, 360);
		}
	}
	//
	public static void main(String[] args) 
	{
		new num2();
	}
	
}

