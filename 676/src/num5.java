import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class num5 extends JFrame 
{
	MyPanel panel = new MyPanel();
	public num5()
	{
		setTitle("�̹��� Ȯ�� ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		setContentPane(panel);
		
		setVisible(true);
		setSize(300,300);
	}
	
	class MyPanel extends JPanel
	{
		ImageIcon icon = new ImageIcon("C:\\Users\\�츮��\\Desktop\\���ȭ��\\2����6ȭ.mp4_snapshot_13.41_[2019.11.10_11.22.56].jpg");
		Image img = icon.getImage();
		private int w = 300, h = 150;
		public MyPanel()
		{
			this.setFocusable(true);
			this.requestFocus();
			this.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e)
				{
					if(e.getKeyChar()=='+')
					{
						w += w/10;
						h += h/10;
					}
					if(e.getKeyChar()=='-')
					{
						w -= w/10;
						h -= h/10;
					}
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.drawImage(img, 0, 0, w, h, this);
		}
	}
	public static void main(String[] args) 
	{
		new num5();

	}
}
