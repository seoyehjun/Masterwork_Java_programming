import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class action_combo extends JFrame
{
	private String [] re = {"rem","ram","puck"};
	private ImageIcon [] images = 
		{ 
		new ImageIcon("C:\\Users\\우리집\\eclipse-workspace\\실험용\\rem.jpg"),
		new ImageIcon("C:\\Users\\우리집\\eclipse-workspace\\실험용\\ram.jpg"),
		new ImageIcon("C:\\Users\\우리집\\eclipse-workspace\\실험용\\puck.jpg")
	};
	private JLabel label =new JLabel();
	public action_combo()
	{
		setTitle("액션  콤보박스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox<String> box = new JComboBox<>(re);
		c.add(box);
		box.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				int index = cb.getSelectedIndex();
				label.setIcon(images[index]);
			}
		});
		
		c.add(label);
		
		setVisible(true);
		setSize(1000,1000);
	}
	
	public static void main(String[] args) 
	{
		
new action_combo();
	}

}
