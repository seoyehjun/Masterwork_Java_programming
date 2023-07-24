import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num2 extends JFrame
{
	private int x=0,y=0;
	private MyPanel panel = new MyPanel();
	public num2()
	{
		setTitle("이미지원 드레깅");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		setContentPane(panel);
		
		setVisible(true);
		setSize(300,300);
	}
	
	class MyPanel extends JPanel
	{
		ImageIcon icon = new ImageIcon("C:\\Users\\우리집\\Desktop\\배경화면\\"
				+ "2시즌11화.mp4_snapshot_07.39_[2019.11.09_19.45.39].jpg");
		Image img = icon.getImage();
		
		public MyPanel()
		{
			addMouseMotionListener(new MouseAdapter() {
				public void mouseDragged(MouseEvent e)
				{
					x = e.getX();
					y = e.getY();
					repaint();
				}
			});
		}
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.drawImage(img,0,0,this.getWidth(),this.getHeight(),this);
			g.setColor(Color.BLACK);
			g.drawOval(x,y,6,6);
			g.fillOval(x, y, 6, 6);
		}
	}
	
	public static void main(String[] args) 
	{
		new num2();
	}
}
