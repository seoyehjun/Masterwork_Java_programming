import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class num7 extends JFrame
{
	Vector<JLabel> vt = new Vector<>();
	JLabel head = new JLabel(new ImageIcon("C:\\Users\\�츮��\\Desktop\\�ڵ�\\"
			+ "material-design-icons-1.0.0\\"
			+ "material-design-icons-1.0.0\\av"
			+ "\\1x_ios\\ic_album_black_24dp.png"));
	public num7()
	{
		setTitle("�����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i=0;i<9;i++)
		{
			vt.add(new JLabel(new ImageIcon("C:\\Users\\�츮��\\Desktop\\�ڵ�\\material"
					+ "-design-icons-1.0.0\\material-design-icons-1.0.0"
					+ "\\av\\1x_ios\\ic_fast_forward_black_24dp.png")));
		}
		
		c.add(head);
		head.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e)
			{
				System.out.println("keypressed");
				int dir = e.getKeyCode();
				switch(dir)
				{
					case KeyEvent.VK_RIGHT:
						head.setLocation(head.getX()+24,head.getY());
						break;
					case KeyEvent.VK_LEFT:
						head.setLocation(head.getX()-24,head.getY());
						break;
					case KeyEvent.VK_UP:
						head.setLocation(head.getX(),head.getY()-24);
						break;
					case KeyEvent.VK_DOWN:
						head.setLocation(head.getX(),head.getY()+24);
						break;
				}
			}
		});
		head.setLocation(50,50);
		head.setSize(24,24);
		for(int i=0;i<=8;i++)// ���� ����κ� �ޱ�
		{
			c.add(vt.get(i));
			vt.get(i).setLocation(0,0);
			vt.get(i).setSize(24,24);
		}
		
		Thread th = new Thread(new HeadThread());
		th.start();
		
		setSize(400,400);
		setVisible(true);
		
		head.setFocusable(true);
		head.requestFocus();
	}
	class HeadThread extends Thread
	{
		public void run()
		{
			Point follower;Point follower2;int direction;
			while(true)
			{
				try 
				{
					Thread.sleep(50);// 200ms���� ������ �������� �̵�(��������)
				}
				catch(InterruptedException e)
				{
					System.out.print("���� �߻�");
					return;
				}
				 direction = (int)(Math.random()*10)%4;//0~3
				
				switch(direction)
				{
					case 0:
						head.setLocation(head.getX()+24,head.getY());
						break;
					case 1:
						head.setLocation(head.getX()-24,head.getY());
						break;
					case 2:
						head.setLocation(head.getX(),head.getY()+24);
						break;
					case 3:
						head.setLocation(head.getX(),head.getY()-24);
						break;
				}
				follower = head.getLocation();
				System.out.println("direction"+direction+" x��ǥ "+follower.x+" y��ǥ"+follower.y);
				
				for(int i=0;i<=8;i++)//���ǰ�����9��
				{
					follower2 = vt.get(i).getLocation();
					vt.get(i).setLocation(follower);
					follower = follower2;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		new num7();
		
	}
}
