import javax.swing.*;
import java.awt.*;

public class num8 extends JFrame
{
	public static void main(String[] args)
	{
		new num8();
	}
	public num8()
	{
		super("여러 개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		c.add(new Top_Panel(),BorderLayout.NORTH );
		c.add(new Center_Panel(),BorderLayout.CENTER );
		c.add(new Buttom_Panel(),BorderLayout.SOUTH );
		
		setVisible(true);
		setSize(300,300);
	}
	

}

class Top_Panel extends JPanel
{
	public Top_Panel()
	{
		setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		setBackground(Color.gray)
		;
		JButton buttonlist[] = new JButton[3];
		buttonlist[0] = new JButton("열기");
		buttonlist[1] = new JButton("닫기");
		buttonlist[2] = new JButton("나가기");
		
		for(int i=0;i<3;i++)
		{
			add(buttonlist[i]);
		}
	}
}

class Center_Panel extends JPanel
{
	public Center_Panel()
	{
		setLayout(null);
		setBackground(Color.white);
		JLabel label[] = new JLabel[10];
		int x,y;
		
		for(int i=0;i<10;i++)//객체 할당밑 위치 설정
		{
			x = (int)(Math.random()*250);//0~250
			y = (int)(Math.random()*250);//0~250
			
			label[i] = new JLabel("*");
			label[i].setSize(3,3);
			label[i].setBackground(Color.red);
			label[i].setLocation(x,y);
			label[i].setOpaque(true);
			add(label[i]);
		}
		
	}
}

class Buttom_Panel extends JPanel
{
	public Buttom_Panel()
	{
		setLayout(new FlowLayout());
		setBackground(Color.yellow);
		
		add(new JButton("Word Input"));
		add(new TextField("                "));
		
	}
}