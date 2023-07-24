import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class num7 extends JFrame 
{
	JLabel label = new JLabel("I Love violet");
	public num7()
	{
		//컨테이너 설정
		setTitle("jSlider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		setVisible(true);
		setSize(400,400);
		
		//슬라이더
		JSlider slider = new JSlider(1,100,50);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMinorTickSpacing(25);
		slider.setMajorTickSpacing(20);
		slider.addChangeListener(new ChangeListener() 
		{
			public void stateChanged(ChangeEvent e)
			{
				label.setFont(new Font("Arial",Font.PLAIN,slider.getValue()));
			}
		});
		c.add(slider,BorderLayout.NORTH );
		
		//라벨
		c.add(label,BorderLayout.CENTER);
		
		
		
		
	}
	public static void main(String[] args) 
	{
		new num7();
	}

}
