import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class 제이슬라이더 extends JFrame 
{
	private JLabel colorLabel;
	private JSlider [] sl = new JSlider [3];
	
	public 제이슬라이더()
	{
		setTitle("슬라이더와 change");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		colorLabel = new JLabel("     SLIDER EXAMPLE     ");
		
		for(int i=0;i<sl.length;i++)
		{
			sl[i]= new JSlider(JSlider.HORIZONTAL ,0,255,128);
			sl[i].setPaintLabels(true);
			sl[i].setPaintTicks(true);
			sl[i].setPaintTrack(true);
			sl[i].setMinorTickSpacing(10);
			sl[i].setMajorTickSpacing(50);
			
			sl[i].addChangeListener(new MyChangeListener());
			c.add(sl[i]);
		}
		
		sl[0].setForeground(Color.RED);
		sl[1].setForeground(Color.GREEN);
		sl[2].setForeground(Color.BLUE);
		
		int r = sl[0].getValue();
		int g = sl[1].getValue();
		int b = sl[2].getValue();
		
		colorLabel.setOpaque(true);
		colorLabel.setBackground(new Color(r,g,b));
		
		c.add(colorLabel);
		setVisible(true);
		setSize(300,230);
		
	}
	class MyChangeListener implements ChangeListener
	{
		public void stateChanged(ChangeEvent e)
		{
			int r = sl[0].getValue();
			int g = sl[1].getValue();
			int b = sl[2].getValue();
			colorLabel.setBackground(new Color(r,g,b));
		}
	}
	
	public static void main(String[] args) 
	{
		new 제이슬라이더();

	}

}
