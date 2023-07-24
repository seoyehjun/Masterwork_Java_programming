import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num6 extends JFrame 
{
	JLabel cresult = new JLabel();CalcDialog calcdialog;
	public num6()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		setTitle("Calculate");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton showdialog = new JButton("calculate");
		calcdialog = new CalcDialog(this,"¾Æ¸ô¶ó",true);
		
		showdialog.addActionListener(new showDialListener());
		c.add(showdialog);
		c.add(cresult);
		
		setVisible(true);
		setSize(300,300);
	}
	class showDialListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			calcdialog.setVisible(true);
		}
	}
	
	
	class CalcDialog extends JDialog
	{
		
		JTextField tf1 = new JTextField(10);
		JTextField tf2 = new JTextField(10);
		public CalcDialog(Frame owner, String title, Boolean ismodal)
		{
			super(owner,title,ismodal);
			setSize(300,300);
			setLayout(new FlowLayout());
			
			JButton button = new JButton("Add");
			button.addActionListener(new MyActionListener());
			add(tf1);
			add(tf2);
			add(button);
		}
		class MyActionListener implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				String temp1 = tf1.getText();
				String temp2 = tf2.getText();
				int result = Integer.parseInt(temp1)+Integer.parseInt(temp2);
				cresult.setText(Integer.toString(result));
			}
		}
	}
	
	
	public static void main(String[] args) 
	{
		new num6();

	}
}
