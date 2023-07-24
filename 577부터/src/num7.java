import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num7 extends JFrame
{
	JLabel la = new JLabel("Ŵ���");
	
	public num7()
	{
		setTitle("test wheel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) 
			{
				int n = e.getWheelRotation();
				
				if(n<0)// ���� �ö󰥶�
				{
					Font f1 = la.getFont();
					int size = f1.getSize();
					la.setFont(new Font("�ü�",Font.PLAIN,size+1));
				}
				else//���� ��������(n�� ����϶�)
				{
					Font f2 = la.getFont();
					int size = f2.getSize();
					la.setFont(new Font("�ü�",Font.PLAIN,size-1));
				}
			}
			
		});
		c.add(la);
		la.setFont(new Font("�ü�",Font.BOLD,10));
		
		setVisible(true);
		setSize(300,200);
		
		c.setFocusable(true);
		c.requestFocus();
		
		
	}
	public static void main(String[] args) 
	{
		new num7();
	}
}
