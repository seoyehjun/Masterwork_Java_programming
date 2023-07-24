import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num5 extends JFrame
{
	JLabel la = new JLabel("Love Java");
	Container c = getContentPane();
	num5()
	{
		setTitle("폰트크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		la.addKeyListener(new myKeyListener());
		
		c.add(la);
		la.setFont(new Font("Arial",Font.PLAIN,10));
		
		
		setVisible(true);
		setSize(300,200);
		
		la.setFocusable(true);
		la.requestFocus();
	}
	
	class myKeyListener extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			int keyCode = e.getKeyCode();
			switch(keyCode)
			{
			case KeyEvent.VK_UP:
				Font f = la.getFont();
				int size = f.getSize();
				la.setFont(new Font("Arial", Font.PLAIN , size+5));
			break;
			
			case KeyEvent.VK_DOWN:
				Font f1 = la.getFont();
				int size1 = f1.getSize();
				la.setFont(new Font("Arial", Font.PLAIN, size1-5));
			break;
			}
		}
	}
	public static void main(String[] args) 
	{
		
		new num5();

	}

}
