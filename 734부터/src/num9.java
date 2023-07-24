import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class num9 extends JFrame 
{
	JLabel [] ls = new JLabel [3];
	JLabel result= new JLabel("마우스를 클릭할때마다 게임합니다.");
	int [] num = new int[3];
	
	public num9()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		setTitle("스레드게임");
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i=0;i<3;i++)
		{
			ls[i] = new JLabel();
		}
		for(int i=0;i<3;i++)
		{
			ls[i].setSize(60, 30); // 레이블 크기
			ls[i].setLocation(30+80*i, 50); // 레이블 위치
			ls[i].setHorizontalAlignment(JLabel.CENTER); // 레이블에 출력되는 수를 센터링
			ls[i].setBackground(Color.MAGENTA);
			ls[i].setForeground(Color.YELLOW);
			ls[i].setOpaque(true);
			
			ls[i].setText(Integer.toString(num[i]));
			ls[i].setFont(new Font("돋음",Font.BOLD,20));
			c.add(ls[i]);
			
		}c.add(result);
		result.setHorizontalAlignment(JLabel.CENTER); // 레이블에 출력되는 수를 센터링
		result.setSize(250, 20);
		result.setLocation(30, 120);
		
		
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				Thread th = new Thread(new ShowThread());
				th.start();
			}
		});
		
		setVisible(true);
		setSize(300,200);
		
	}
	class ShowThread extends Thread
	{
		public void run()
		{
			for(int i=0;i<3;i++)
			{
				num[i] = (int)(Math.random()*10)%5;
				ls[i].setText(Integer.toString(num[i]));
				
				try {Thread.sleep(200);}
				catch(InterruptedException e) {return;}
			}
			if(num[0]==num[1]&&num[1]==num[2])result.setText("축하합니다.");
			else result.setText("아쉽내요");
		}
	}
	public static void main(String[] args) 
	{
		new num9();
	}
}
