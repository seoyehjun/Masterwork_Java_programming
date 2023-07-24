import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class textfield extends JFrame
{
	public textfield()
	{
		setTitle("텍스트필드 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JPanel pan = new JPanel();
		
		pan.add(new JLabel("이름"));
		pan.add(new JTextField(20));
		pan.add(new JLabel("학과"));
		pan.add(new JTextField("컴퓨터 공학과",20));
		pan.add(new JLabel("주소"));
		pan.add(new JTextField("서울시...",20));
		c.add(pan);
		
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new textfield();

	}

}
