import javax.sound.sampled.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.Vector;

public class num8 extends JFrame
{
	Vector<Clip> vt = new Vector<>();
	Clip clip;
	JCheckBox cb1 = new JCheckBox("Along th Road");
	JCheckBox cb2 = new JCheckBox("Fall to the Rise");
	JButton start = new JButton("연주 시작");
	JButton end = new JButton("끝내기");
	
	public num8()
	{
		setTitle("오디오 연주");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		cb1.addItemListener(new MyItemListener());
		cb2.addItemListener(new MyItemListener());
		start.addActionListener(new startAction());
		end.addActionListener(new endAction());
		c.add(cb1);
		c.add(cb2);
		c.add(start);
		c.add(end);
		
		setVisible(true);
		setSize(300,300);
	
	}
	class startAction implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
		}
	}
	class endAction implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
		}
	}
	class MyItemListener implements ItemListener
	{
		public void itemStateChanged(ItemEvent e)
		{
			String path = "";
			JCheckBox temp = (JCheckBox)e.getSource();
			if(temp ==cb1&&e.getStateChange()==ItemEvent.SELECTED)
			{
				path = "C:\\Users\\우리집\\Desktop\\코딩\\NCT-x-T-_-Sugah-Along-The-Road-_feat.-Voicians_-_NCS-Release_.wav";
			}
			if(temp == cb2&&e.getStateChange()==ItemEvent.SELECTED)
			{
				path = "C:\\Users\\우리집\\Desktop\\코딩\\Laszlo-Fall-To-Light-_NCS-Release_.wav";
			}
			try
			{ 
				clip = AudioSystem.getClip();
				File file = new File(path);
				AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
				clip.open(audioStream);
			}
			catch(LineUnavailableException e1){e1.printStackTrace();}
			catch(UnsupportedAudioFileException e2) {e2.printStackTrace();}
			catch(IOException e3) {e3.printStackTrace();}
			vt.add(clip);
		}
	}
	public static void main(String[] args) 
	{
		new num8();
	}
}
