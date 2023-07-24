import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num1 extends JFrame
{
	MyPanel panel = new MyPanel();
	public num1()
	{
		setTitle("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		setContentPane(panel);
		
		setSize(300,400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel
	{
		JButton button = new JButton("Hide/Show");
		private ImageIcon icon = new ImageIcon("C:\\Users\\우리집\\Desktop\\배경화면\\"
				+ "[Ohys-Raws] Re - Zero Kara Hajimeru Isekai Seikatsu - 24 (TX 1280x720 x264 AAC).mp4_snapshot_04.05_[2019.11.03_16.06.14].jpg");
		private Image img = icon.getImage();
		boolean show = true;
		
		public MyPanel()
		{
			add(button);
			setLayout(new FlowLayout());
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					show = !show;
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			if(show)g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}
	
	public static void main(String[] args) 
	{
		new num1(); 
	}
}
