import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num3 extends JFrame
{
	MyPanel panel = new MyPanel();
	public num3()
	{
		setTitle("드레깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		setContentPane(panel);
		
	
	
		
		setVisible(true);
		setSize(1000,1000);
	}
	
	class MyPanel extends JPanel
	{
		ImageIcon icon = new ImageIcon("C:\\Users\\우리집\\Desktop\\배경화면\\닭\\보자기.jpg");
		Image img = icon.getImage();
		private int x=0,y=0;
		public MyPanel()
		{
			addMouseMotionListener(new MouseAdapter() {
				public void mouseDragged(MouseEvent e)
				{
					x=e.getX();
					y=e.getY();
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.drawImage(img, x, y, 150,150,this);
		}
	}
	
	public static void main(String[] args) 
	{
		new num3();
	}

}
