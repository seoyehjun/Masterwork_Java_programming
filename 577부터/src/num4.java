import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num4 extends JFrame
{
	JLabel la = new JLabel("Love Java");
	public num4()
	{
		setTitle("num4 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = getContentPane();
	    c.setLayout(new FlowLayout());
		
		c.add(la);
		c.addKeyListener(new myKeyListener());
		
		setVisible(true);
		setSize(300,200);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class myKeyListener extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			
			String temp="앙";
			if(KeyEvent.VK_LEFT==e.getKeyCode())
	     	{
				temp = la.getText();//keyPressed 실행마다 라벨텍스트 가져온다.
				la.setText(temp.substring(1)+temp.charAt(0));
			}
		}
	}
	public static void main(String[] args) 
	{
		new num4();

	}
}
