import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class num6 extends JFrame
{
	JSlider sl = new JSlider(0,100,50);
	JTextArea ta = new JTextArea(7,20);
	
	public num6()
	{
		setTitle("ta Frame practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		setVisible(true);
		setSize(300,300);
		
		//textArea
		c.add(ta);
		ta.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e)
			{
				System.out.print("keytyped");
				JTextArea temp1 = (JTextArea)e.getSource();
				String temp2 = temp1.getText();
				sl.setValue(temp2.length());
				System.out.println("temp2.length():"+temp2.length()+"  temp1:"+temp1.getText());
			}
		});
		ta.setFocusable(true);
		ta.set
		ta.requestFocus();
		
		
		//Slider
		sl.setPaintLabels(true);
		sl.setPaintTicks(true);
		sl.setPaintTrack(true);
		sl.setMinorTickSpacing(2);
		sl.setMajorTickSpacing(20);
		sl.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e)
			{
				JSlider temp = (JSlider)e.getSource();
				StringBuffer temp2 = new StringBuffer(ta.getText());
				System.out.println("temp2:"+temp2.toString());
				if(temp2.length()>temp.getValue())
				{
					temp2.deleteCharAt(temp2.length()-1);
					ta.removeAll();
					ta.setText(temp2.toString());
				}
			}
		});
		c.add(sl);
		
		
	}
	public static void main(String[] args) 
	{
		new num6();
	}

}
