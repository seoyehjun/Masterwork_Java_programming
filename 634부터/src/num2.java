import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class num2 extends JFrame
{
	public num2()
	{
		setTitle("TextField and ComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField tf = new JTextField(10);
		JComboBox<String> cb = new JComboBox<>();
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String temp = tf.getText();
				tf.setText("");
				cb.addItem(temp);
			}
		});
		
		c.add(tf);
		c.add(cb);
		
		setVisible(true);
		setSize(500,500);
	}
	public static void main(String[] args) 
	{
		new num2();
	}
}
