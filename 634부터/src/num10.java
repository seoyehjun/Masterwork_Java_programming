import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num10 extends JFrame 
{
	Container c;
	JLabel labels[] = new JLabel[10];
	static int turn =0;
	MymouseListener listener = new MymouseListener();
	public num10()
	{
		setTitle("Ten 레이블 클릭");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		c.setLayout(null);  
		Setlabel();
		setVisible(true);
		setSize(350,350);
		
	}
	public void Setlabel()
	{
		for(int i=0;i<labels.length;i++)
		{
			labels[i]=new JLabel(Integer.toString(i));
			c.add(labels[i]);
			labels[i].setSize(10,10);
			labels[i].setLocation((int)(Math.random()*300)+1,(int)(Math.random()*300)+1);
		}
		labels[0].addMouseListener(listener);
	}
	class MymouseListener extends MouseAdapter
	{
		public void mouseClicked(MouseEvent e)
		{
			
			turn++;
			if(turn==10)
			{
				labels[turn-1].removeMouseListener(listener);
				labels[turn-1].setVisible(false);
				turn=0;
				Setlabel();
				return;
			}
			labels[turn].addMouseListener(listener);
			labels[turn-1].removeMouseListener(listener);
			labels[turn-1].setVisible(false);
			
		}
	}
	public static void main(String[] args) 
	{
		new num10();

	}

}
