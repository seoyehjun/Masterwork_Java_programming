import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class radiobutton extends JFrame
{
	public radiobutton()
	{
		setTitle("라디오 버튼 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("C:\\Users\\우리집\\eclipse-workspace\\실험용\\Re_Zero Can Badge Ram ,Re_Zero Can Badge Ram,Collectible listed at CDJapan! Get it delivered safely by SAL, EMS, FedEx and save with CDJapan Rewards!.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("C:\\Users\\우리집\\eclipse-workspace\\실험용\\3cdc84b1-da51-4010-bf39-21626ce2c25a.jpg");
		
		ButtonGroup g = new ButtonGroup();
		
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배",true);
		JRadioButton cherry = new JRadioButton("체리",cherryIcon);
		
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);
		
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250,150);
		setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		new radiobutton();

	}

}
