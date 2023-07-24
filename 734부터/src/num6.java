import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;


public class num6 extends JFrame
{
	JLabel labelset[] = new JLabel[1000];
	Vector<Thread> vt = new Vector<>();
	Vector<JLabel> vt2 = new Vector<>();
	int count=0;JLabel ttemp;
	
	GamePanel panel = new GamePanel();
	public num6() 
	{
		setTitle("버블");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		setContentPane(panel);
		
		
		setVisible(true);
		setSize(300,300);
	}
	class GamePanel extends JPanel
	{
		public GamePanel()
		{
			setLayout(new FlowLayout());
			add(new JLabel("확인"));
			addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e)
			{
				vt2.add(new JLabel("거품"));
				vt2.get(count).setLocation(e.getPoint());
				add(vt2.get(count));
				
				vt.add(new UpThread(vt2.get(count)));// 생성된 라벨을 위로올라가게하는 Thread생성
				vt.get(count).start();
				
				count++;
			}
			});
		}
	}
	
	class UpThread extends Thread
	{
		JLabel label;
	 
		public UpThread(JLabel temp)
		{
			label = temp;
		}
		
		public void run()
		{
			while(true)
			{
				try
				{
					Thread.sleep(20);
				}
				catch(InterruptedException e)
				{
					System.out.print("오류 발생");
					return;
				}
				label.setLocation(label.getX(),label.getY()+1);
			}
		}
	}

	public static void main(String[] args) 
	{
		new num6();
	}
}
