import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class num1 extends JFrame
{
	private JLabel la = new JLabel("�����Թ�");
	
    public num1()
	{
		setTitle("JLabel Test");
		Container c = getContentPane();
		
		la.addMouseListener(new MyMouseListener());// ������ �߰�
		
		c.setLayout(new FlowLayout());
		c.add(la);
		
		setSize(300,200);
		setVisible(true);
	}
    
    class MyMouseListener extends MouseAdapter
    {
    	public void mouseEntered(MouseEvent e)
    	{
    		la.setText("Love Java");
    	}
    	
    	public void mouseExited(MouseEvent e)
    	{
    		la.setText("�����");
    	}
    }
	public static void main(String[] args) 
	{
		new num1();

	}
}
