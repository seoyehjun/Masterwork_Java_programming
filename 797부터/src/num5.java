import javax.sound.sampled.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num5 extends JFrame
{
	private Clip clip;
	private JLabel state= new JLabel("������� �ƴ�");
	public num5()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		setTitle("����� - ���콺 ����");
		Container c = getContentPane();
		loadAudio("C:\\Users\\�츮��\\Desktop\\�ڵ�\\NCT-x-T-_-Sugah-Along-The-Road-_feat.-Voicians_-_NCS-Release_.wav");
		
		c.addMouseListener(new AudioMouseListener());
		c.add(state);
		
		setVisible(true);
		setSize(300,300);
	}
	class AudioMouseListener extends MouseAdapter
	{
		public void mouseEntered(MouseEvent e)
		{
			clip.start();
			state.setText("�����");
		}
		public void mouseExited(MouseEvent e)
		{
			clip.stop();
			state.setText("������� �ƴ�");
		}
	}
	private void loadAudio(String pathName)
	{
		try
		{
			clip = AudioSystem.getClip();
			File file = new File(pathName);
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
			clip.open(audioStream);
		}
		catch(LineUnavailableException e) {e.printStackTrace();}
		catch(UnsupportedAudioFileException e) {e.printStackTrace();}
		catch(IOException e) {e.printStackTrace();}
	}
	public static void main(String[] args) 
	{
		new num5();

	}
}
