import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BlueLabel1 extends JLabel
{
	public BlueLabel1(String temp)
	{
		super(temp);
	}
	public BlueLabel1(ImageIcon temp)
	{
		super(temp);
	}
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		super.paintComponent(g);
	}
}
class BlueLabel2 extends JLabel
{
	public BlueLabel2(String temp)
	{
		super(temp);
		this.setBackground(Color.BLUE);
	}
	public BlueLabel2(ImageIcon temp)
	{
		super(temp);
		this.setBackground(Color.BLUE);
	}
	public void setBackground(Color color)
	{
		super.setBackground(Color.BLUE);
		return;
	}
}
public class num9 extends JFrame 
{
	public num9()
	{
		setTitle("BlueLabel Å×½ºÆ®");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		BlueLabel1 label = new BlueLabel1("Blue");
		label.setForeground(Color.YELLOW);
		c.add(label);
		
		BlueLabel2 label2 = new BlueLabel2("¾È³Õ");
		label2.setFont(new Font("TimesRoman", Font.ITALIC, 50));
		label2.setOpaque(true);
		label2.setBackground(Color.BLUE);
		label2.setForeground(Color.YELLOW);
		c.add(label2);
		
		setVisible(true);
		setSize(400,300);
	}
	
	public static void main(String[] args) 
	{
		new num9();
	}
}