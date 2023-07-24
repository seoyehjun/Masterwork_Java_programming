import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class num9 extends JFrame
{
	static ImageIcon [] icons= {new ImageIcon("C:\\Users\\�츮��\\Desktop\\���ȭ��\\��\\����.jpg"),
			new ImageIcon("C:\\Users\\�츮��\\Desktop\\���ȭ��\\��\\����.jpg"),
			new ImageIcon("C:\\Users\\�츮��\\Desktop\\���ȭ��\\��\\���ڱ�.jpg")};
	String [] rcp = {"����","����","��"};
	North_Panel menu = new North_Panel();
	Center_Panel result = new Center_Panel();
	public num9()
	{
		setTitle("���� ���� ���ڱ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		//---------- �����б�
		
		
		c.add(menu,BorderLayout.NORTH);
		c.add(result,BorderLayout.CENTER);
		
		setVisible(true);
		setSize(400,400);
	}
	
	class North_Panel extends JPanel
	{
		
		JButton []select = new JButton [3];
		public North_Panel()
		{
			
			setLayout(new FlowLayout());
			for(int i=0;i<icons.length;i++)
			{
				select[i]=new JButton(rcp[i]);
				select[i].setIcon(icons[i]);
				add(select[i]);
				select[i].addActionListener(new MyActionListener());
			}
		}
	}
	
	
	class MyActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String winner ="same";// ���� ���º� ����
			JButton temp = (JButton)e.getSource();
			int computer_choice = (int)(Math.random()*3);//0~2
			if(// ������ �̱�� ����Ǽ�
					temp.getIcon()==icons[0]&&computer_choice==2||//����-���ڱ�
					temp.getIcon()==icons[1]&&computer_choice==0||//�ָ�-����
					temp.getIcon()==icons[2]&&computer_choice==1) //���ڱ�-�ָ�
			{
				winner="user-win!!";
			}
			else if(// ��ǻ�Ͱ� �̱�� ����� ��
					temp.getIcon()==icons[0]&&computer_choice==1||//����-�ָ�
					temp.getIcon()==icons[1]&&computer_choice==2||//����-���ڱ�
					temp.getIcon()==icons[2]&&computer_choice==0)//���ڱ�-����
			{
				winner="computer-win!!";
			}
			else //���º��ΰ��
			{
				winner="same";
			}
			result.SetState(temp, icons[computer_choice], winner);		
		}
	}
	
	class Center_Panel extends JPanel
	{
		private JLabel me = new JLabel("me");
		private JLabel computer = new JLabel("com");
		private JLabel winner = new JLabel("winner");
		
		public Center_Panel()
		{
			setLayout(new FlowLayout());
			add(me);
			add(computer);
			add(winner);
			
		}
		
		public void SetState(JButton user,Icon com,String winner)// winner�� ���� ����
		{
			me.setIcon(user.getIcon());
			computer.setIcon(com);
			this.winner.setText(winner);
		}
	}
	public static void main(String[] args)
	{
	
		new num9();
	}
}
