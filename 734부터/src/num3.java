import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class num3 extends JFrame
{
	JLabel timelabel = new JLabel();
	
	
	public num3()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		setTitle("½Ã°£");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(timelabel);
		
		Thread th = new Thread(new MyThread());
		th.start();
		
		setVisible(true);
		setSize(400,300);
	}
	
	class MyThread extends Thread
	{
		public void run()
		{
			int hour = 0, min = 0, count = 0;
			String clockText = hour + " : " + min + " : " + count;
			
			while(true)
			{	
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{
					return;
				}
				
				count++;
				if(count >= 60) {min++; count=0;}
				if(min >= 60) {hour++; count=0;}
				clockText = hour + " : " + min + " : " + count;
				timelabel.setText(clockText);
				
			}
			
		}
	}
	
	public static void main(String[] args) 
	{
		new num3();
	}
}
