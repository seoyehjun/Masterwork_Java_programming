import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class num7 extends JFrame
{
	int xlist[] = new int[30];
	int ylist[] = new int[30];
	int pointcount=0;
	
	MyPanel panel = new MyPanel();
	public num7()
	{
		setTitle("마우스로 다각형 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		setContentPane(panel);
		
		setVisible(true);
		setSize(400,400);
	}
	class MyPanel extends JPanel
	{
		public MyPanel()
		{
			addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e)
				{
					xlist[pointcount] = e.getX();
					ylist[pointcount] = e.getY();
					pointcount++;
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.drawPolygon(xlist,ylist,pointcount);
		}
	}
	public static void main(String[] args)
	{
		new num7();
	}
}
