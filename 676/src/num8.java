import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class num8 extends JFrame
{
	MyPanel panel = new MyPanel();
	public num8()
	{
		setTitle("drawCircle");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		setContentPane(panel);
		
		setVisible(true);
		setSize(800,400);
		
	}
	class MyPanel extends JPanel
	{
		int startx , starty , x , y;//드레그시 필요한 원의 위치와 크기
		Vector<Circle> vt = new Vector<>();
		
		public MyPanel()
		{
			//마우스를 눌럿을때 뗏을때의 리스너
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e)
				{
					startx = e.getX();
					starty = e.getY();
				}
				public void mouseReleased(MouseEvent e)
				{
					vt.add(new Circle(startx , starty , e.getX() , e.getY()));
					getParent().repaint();
				}
			});
			// 마우스 드레그시 리스너
			addMouseMotionListener(new MouseAdapter() {
				public void mouseDragged(MouseEvent e)
				{
					x = e.getX();
					y = e.getY();
					getParent().repaint();
				}
			});
			
		}
		public void paintComponent(Graphics g)
		{
			g.drawOval(startx, starty, x-startx, y-starty);
			
			for(int i=0;i<vt.size();i++)
			{
				Circle temp = vt.get(i);
				g.drawOval(temp.startx , temp.starty , temp.x-temp.startx , temp.y-temp.starty);
			}
		}
	}
	
	class Circle
	{
		int startx,starty;
		int x,y;// x는가로y는세로
		public Circle(int startx ,int starty , int x , int y)
		{
			this.startx = startx;
			this.starty = starty;
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) 
	{
		new num8();

	}
}
