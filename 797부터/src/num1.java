import javax.swing.*;
import java.awt.*;

public class num1 extends JFrame
{
	public num1()
	{
		setTitle("빰빠바밤");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		
		createMenu();
		setVisible(true);
		setSize(250,200);
	}
	private void createMenu()
	{
		JMenuBar bar = new JMenuBar();
		JMenu screenMenu = new JMenu("보기");
		
		bar.add(new JMenu("파일"));
		bar.add(new JMenu("편집"));
		bar.add(screenMenu);
		bar.add(new JMenu("입력"));
		
		screenMenu.add(new JMenuItem("화면확대"));
		screenMenu.add(new JMenuItem("쪽윤곽"));
		
		setJMenuBar(bar);
		
	}
	public static void main(String[] args)
	{
		new num1();
	}

}
