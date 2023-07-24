import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num6 extends JFrame
{
	JLabel la = new JLabel("c");
	public num6() 
	{
		setTitle("클릭 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
	    la.addMouseListener(new MouseAdapter() {
	    	public void mouseClicked(MouseEvent e)
	    	{
	    		int x = (int)(Math.random()*200)+50;
	    		int y = (int)(Math.random()*200)+50;
	    		la.setLocation(x,y);
	    	}
	    });
	    
		c.add(la);
		la.setLocation(350,420);
		la.setSize(10,10);
		la.setOpaque(true);
		
		setVisible(true);
		setSize(400,500);
		
		c.setFocusable(true);
	    c.requestFocus();
	}
	
	
	public static void main(String[] args) 
	{
		new num6();
		
	}
}
