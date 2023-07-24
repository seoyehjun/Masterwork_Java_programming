import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num10 extends JFrame 
{
	MyPanel panel = new MyPanel();
	public num10()
	{
		setTitle("타원 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		setContentPane(panel);
		Container c = getContentPane();
		
		setVisible(true);
		setSize(1000,1000);
	}
	
	class MyPanel extends JPanel
	{
		public MyPanel()
		{
			setLayout(null);
			Thread th = new Thread(new MyThread(this));
			th.start();
			addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent e)
				{
					System.out.print("mouseEnter");
					synchronized(th)
					{
						th.notify();
					}
				}
			});
			addMouseListener(new MouseAdapter() {
				public void mouseExited(MouseEvent e)
				{
					try {
						synchronized(th)
						{
							System.out.println("out");
							th.wait(); 
						}
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
		
		}
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setColor(Color.CYAN);
			g.drawOval((int)(Math.random()*200+1),(int)(Math.random()*200+1),(int)(Math.random()*400+1),(int)(Math.random()*400+1));// 1~200까지의 난수?
		}
	}
	class MyThread extends Thread
	{
		JPanel setPanel;
		public MyThread(JPanel panel)
		{
			
			this.setPanel= panel;
		}
		public void run()
		{
			try
			{
				while(true)
				{
					System.out.print("run");
					setPanel.repaint();
					Thread.sleep(300);
				}
			}
			catch(InterruptedException e)
			{
				return;
			}
		}
	}
	public static void main(String[] args)
	{
		new num10();
	}
}
