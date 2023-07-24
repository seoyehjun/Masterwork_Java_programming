import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num1 extends JFrame
{
	public num1()
	{
		setTitle("checkbox practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox jb1 = new JCheckBox("버튼 비활성화");
		JCheckBox jb2 = new JCheckBox("버튼 감추기");
		JButton jb = new JButton("puck",new ImageIcon("C:\\Users\\우리집\\eclipse-workspace\\실험용\\puck.jpg"));
		
		
		jb1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				if(jb.isEnabled())jb.setEnabled(false);//
				else jb.setEnabled(true);
			}
		});
		jb2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				if(jb.isVisible())jb.setVisible(false);//isVisible=true
				else jb.setVisible(true);
			}
		});
		c.add(jb1);
		c.add(jb2);
		c.add(jb);
		
		setVisible(true);
		setSize(1000,1000);
		
	}
	public static void main(String[] args) 
	{
		new num1();

	}

}
