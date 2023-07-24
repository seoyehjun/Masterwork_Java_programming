import javax.swing.*;
import java.awt.*;

public class num7 extends JFrame
{
	
	public num7()
	{
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new North_Panel(),BorderLayout.NORTH);
		c.add(new Center_Panel(),BorderLayout.CENTER );
		c.add(new Button_Panel(),BorderLayout.SOUTH );
		
		setSize(300,300);
		setVisible(true);
		
		
	}

	public static void main(String[] args) 
	{
	
		new num7();
	}

}

class North_Panel extends JPanel
{
	public North_Panel()
	{
		setBackground(Color.gray);
		setLayout(new GridLayout(1,2));
		
		add(new JLabel("수식입력"));
		add(new JTextField(""));
	}
	
}

class Center_Panel extends JPanel
{
	public Center_Panel()
	{
		setLayout(new GridLayout(4,4,5,5));
		setSize(166,126);
		
		JButton button_list[] = new JButton[10];
		
		for(int i=0;i<10;i++)
		{
			button_list[i] =new JButton(i+"");
		}
		
		for(int j=0;j<10;j++)
		{
			button_list[j].setSize(50,40);
			add(button_list[j]);
		}
		add(new JButton("CE"));
		add(new JButton("계산"));
		add(new JButton("+"));
		add(new JButton("-"));
		add(new JButton("*"));
		add(new JButton("/"));
		
	}
}

class Button_Panel extends JPanel
{
	public Button_Panel()
	{
		setSize(166,50);
		setLayout(new GridLayout(1,2));
		JLabel label = new JLabel("계산결과");
		JTextField button = new JTextField("");
	
		
		add(label);
		add(button);
	}
}