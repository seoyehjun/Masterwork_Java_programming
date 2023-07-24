import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class num8 extends JFrame
{
	MyPanel panel = new MyPanel();
	ImageIcon icon = new ImageIcon("C:\\Users\\우리집\\Desktop\\배경화면\\"
			+ "[Ohys-Raws] Re - Zero Kara Hajimeru Isekai Seikatsu - "
			+ "01 (TX 1280x720 x264 AAC).mp4_snapshot_10.32_"
			+ "[2019.11.01_17.19.31].jpg");
	Image img = icon.getImage();
	Vector<Point> vt = new Vector<Point>();
	public num8()
	{
		for(int i=0;i<50;i++)
		{
			Point temp = new Point((int)(Math.random()*400),(int)(Math.random()*400));
			vt.add(temp);
		}
		setTitle("눈마을");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		setContentPane(panel);
		
		Thread th = new Thread(new SnowThread());
		th.start();

		setVisible(true);
		setSize(400,400);
	}
	class MyPanel extends JPanel
	{
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			g.setColor(Color.WHITE);
			for(int i=0;i<vt.size();i++)
			{
				Point p = vt.get(i);
				g.fillOval(p.x, p.y, 10, 10);
			}
		}
	}
	class SnowThread extends Thread
	{
		public void run()
		{
			while(true)
			{
				try
				{
					sleep(300);
				}
				catch(InterruptedException e)
				{
					return;
				}
				changeSnowPosition();
				repaint();
			}
		}
		public void changeSnowPosition()
		{
			for(int i=0;i<50;i++)
			{
				vt.get(i).setLocation(vt.get(i).getX(),vt.get(i).getY()+1);
				if(vt.get(i).getY()>=400)vt.get(i).setLocation(vt.get(i).getX(),0);
			}
		}
	}
	public static void main(String[] args) 
	{
		new num8();
	}
}
