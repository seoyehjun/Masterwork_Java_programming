import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class num9 extends JFrame 
{
	JLabel [] ls = new JLabel [3];
	JLabel result= new JLabel("���콺�� Ŭ���Ҷ����� �����մϴ�.");
	int [] num = new int[3];
	
	public num9()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		setTitle("���������");
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i=0;i<3;i++)
		{
			ls[i] = new JLabel();
		}
		for(int i=0;i<3;i++)
		{
			ls[i].setSize(60, 30); // ���̺� ũ��
			ls[i].setLocation(30+80*i, 50); // ���̺� ��ġ
			ls[i].setHorizontalAlignment(JLabel.CENTER); // ���̺� ��µǴ� ���� ���͸�
			ls[i].setBackground(Color.MAGENTA);
			ls[i].setForeground(Color.YELLOW);
			ls[i].setOpaque(true);
			
			ls[i].setText(Integer.toString(num[i]));
			ls[i].setFont(new Font("����",Font.BOLD,20));
			c.add(ls[i]);
			
		}c.add(result);
		result.setHorizontalAlignment(JLabel.CENTER); // ���̺� ��µǴ� ���� ���͸�
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
			if(num[0]==num[1]&&num[1]==num[2])result.setText("�����մϴ�.");
			else result.setText("�ƽ�����");
		}
	}
	public static void main(String[] args) 
	{
		new num9();
	}
}
