import javax.swing.*;
import java.awt.*;

public class num4 extends JFrame implements Runnable
{
	JLabel label = new JLabel("���� ���̺�");
	public num4()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		setTitle("������");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		label.setFont(new Font("����",Font.BOLD ,20));
		c.add(label);
		Thread th = new Thread(this);
		th.start();
	
		setVisible(true);
		setSize(300,300);
	}
	public void run()
	{
		while(true)
			{
			
				label.setLocation(100,100);
				label.setLocation(105,100);
				label.setLocation(100,105);
				label.setLocation(95,100);
				label.setLocation(100,95);
			}
	}
	
	public static void main(String [] args) 
	{
		new num4();
	}
}

	