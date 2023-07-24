import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class num9 extends JFrame
{
	static ImageIcon [] icons= {new ImageIcon("C:\\Users\\우리집\\Desktop\\배경화면\\닭\\가위.jpg"),
			new ImageIcon("C:\\Users\\우리집\\Desktop\\배경화면\\닭\\바위.jpg"),
			new ImageIcon("C:\\Users\\우리집\\Desktop\\배경화면\\닭\\보자기.jpg")};
	String [] rcp = {"가위","바위","보"};
	North_Panel menu = new North_Panel();
	Center_Panel result = new Center_Panel();
	public num9()
	{
		setTitle("가위 바위 보자기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		//---------- 파일읽기
		
		
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
			String winner ="same";// 승패 무승부 여부
			JButton temp = (JButton)e.getSource();
			int computer_choice = (int)(Math.random()*3);//0~2
			if(// 유저가 이기는 경우의수
					temp.getIcon()==icons[0]&&computer_choice==2||//가위-보자기
					temp.getIcon()==icons[1]&&computer_choice==0||//주먹-가위
					temp.getIcon()==icons[2]&&computer_choice==1) //보자기-주먹
			{
				winner="user-win!!";
			}
			else if(// 컴퓨터가 이기는 경우의 수
					temp.getIcon()==icons[0]&&computer_choice==1||//가위-주먹
					temp.getIcon()==icons[1]&&computer_choice==2||//바위-보자기
					temp.getIcon()==icons[2]&&computer_choice==0)//보자기-가위
			{
				winner="computer-win!!";
			}
			else //무승부인경우
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
		
		public void SetState(JButton user,Icon com,String winner)// winner이 승자 결정
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
