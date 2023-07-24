import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class num5 extends JFrame 
{
	JLabel jl = new JLabel("150");
	public num5()
	{
		//프레임 기본설정
		setTitle("JSlider practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//슬라이더 
		JSlider js = new JSlider(100,200,150);
		js.setPaintLabels(true);
		js.setPaintTicks(true);
		js.setPaintTrack(true);
		js.setMinorTickSpacing(20);
		js.setMajorTickSpacing(20);
		c.add(js);
		js.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e)
			{
				JSlider temp =(JSlider)e.getSource();
				jl.setText(Integer.toString(temp.getValue()));
			}
		});
		
		// 라벨
		c.add(jl);
		jl.setBackground(Color.green);
		jl.setOpaque(true);
		
		setVisible(true);
		setSize(300,200);
		
	}
	
	public static void main(String[] args) 
	{
		new num5();

	}

}
