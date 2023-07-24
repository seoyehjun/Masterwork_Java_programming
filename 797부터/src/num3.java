import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num3 extends JFrame 
{
	Container c;
	public num3()
	{
		setTitle("종료시험");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		c = getContentPane();
		c.setLayout(new BorderLayout());
		
		createToolBar();
		
		setVisible(true);
		setSize(200,200);
	}
	private void createToolBar()
	{
		JToolBar tb = new JToolBar();
		JButton button = new JButton("종료");
		
		tb.add(button);
		button.addActionListener(new MyAction());
		
		c.add(tb,BorderLayout.NORTH);
		
	}
	private class MyAction implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int result = JOptionPane.showConfirmDialog(null , "종료하시겠습니까?" , "Confirm" , JOptionPane.YES_NO_OPTION);
			
			if(result == JOptionPane.YES_OPTION)System.exit(0);
		}
	}
	public static void main(String[] args) 
	{
		new num3();
	}
}
