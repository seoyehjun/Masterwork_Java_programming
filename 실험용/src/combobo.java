import java.awt.*;
import javax.swing.*;

public class combobo extends JFrame 
{
	String [] fruits= {"apple","banana","kiwi","mango","pear","peach","berry","strawberry","blackberry"};
	
	
	public combobo()
	{
		setTitle("콤보박스 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox<String> strCombo = new JComboBox<String>(fruits);
		c.add(strCombo);
		
		setVisible(true);
		setSize(400,400);
	}
	
	public static void main(String[] args) 
	{
		new combobo();
	}

}
