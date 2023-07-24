import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num10 extends JFrame 
{
	ImageIcon icon =new ImageIcon("C:\\Users\\우리집\\Desktop\\배경화면\\"
			+ "2시즌7화.mp4_snapshot_16.04_[2019.11.11_10.48.43].jpg");
	Image image = icon.getImage();
	MyPanel panel = new MyPanel();
	
	public num10()
	{
		setTitle("이미지 짤라서 출력");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		setContentPane(panel);
		
		
		setVisible(true);
		setSize(400,400);
	}
	
	class MyPanel extends JPanel
	{
		public MyPanel()
		{
			setLayout(null);
		}
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.drawImage(image,0,0,(this.getWidth()/2)-5,(this.getHeight()/2)-5,
					0,0,image.getWidth(this)/2,image.getHeight(this)/2,this);
			g.drawImage(image, (this.getWidth()/2)+5, 0,
					this.getWidth(), this.getHeight()/2-5,
					image.getWidth(this)/2, 0, image.getWidth(this), image.getHeight(this)/2, this);
			g.drawImage(image, 0, this.getHeight()/2+5, this.getWidth()/2-5, this.getHeight(),
					0, image.getHeight(this)/2, image.getWidth(this)/2, image.getHeight(this), this);
			g.drawImage(image, this.getWidth()/2+5, this.getHeight()/2+5, this.getWidth(), this.getHeight(),
					image.getWidth(this)/2, image.getHeight(this)/2, image.getWidth(this), image.getHeight(this), this);
		}
	}
	
	public static void main(String[] args) 
	{
		new num10();
	}
}
