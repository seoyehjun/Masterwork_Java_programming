import javax.sound.sampled.*;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class num7 extends JFrame
{
	Clip clip;
	public num7()
	{
		setTitle("오디오 재생");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		
		JMenuBar mb = new JMenuBar();
		JMenu menu = new JMenu("오디오");
		JMenuItem mi1 = new JMenuItem("연주");
		JMenuItem mi2 = new JMenuItem("종료");
		menu.add(mi1);
		menu.add(mi2);
		mb.add(menu);
		
		mi1.addActionListener(new MyActionListener());
		mi2.addActionListener(new Myrection());
		
		setJMenuBar(mb);
		
		setVisible(true);
		setSize(300,300);
	}
	class MyActionListener implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e)
		{
			JFileChooser chooser = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter("wav file","wav");
			chooser.setFileFilter(filter);
			
			int ret = chooser.showOpenDialog(null);
			if(ret != JFileChooser.APPROVE_OPTION) 
			{
				JOptionPane.showMessageDialog(null, "파일을 선태갛지 않았습니다.","경고",JOptionPane.WARNING_MESSAGE);
				return;
			}
			
			String path = chooser.getSelectedFile().getPath();
			
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
			
			clip.start();
		}
	}
	class Myrection implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			clip.stop();
		}
	}
	
	public static void main(String[] args) 
	{
		new num7();
	}
}
