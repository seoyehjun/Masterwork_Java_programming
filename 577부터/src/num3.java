import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class num3 extends JFrame
{
	
	JLabel la = new JLabel("Love Java");
	num3()
	{
		setTitle("오이시이쿠다사이");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		Container c = getContentPane();
		
		c.add(la);
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		la.addKeyListener(new myKeyListener());
		
		setVisible(true);
		setSize(300,200);
		
		la.setFocusable(true);
		la.requestFocus();
	}
	class myKeyListener extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			if(e.getKeyCode() == KeyEvent.VK_LEFT)
			{
				String temp = la.getText();
				StringBuffer sb = new StringBuffer(la.getText());
				la.setText(sb.reverse().toString());
			}
		}
	}
	
	public static void main(String[] args) 
	{
		new num3();

	}
}
