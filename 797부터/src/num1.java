import javax.swing.*;
import java.awt.*;

public class num1 extends JFrame
{
	public num1()
	{
		setTitle("�����ٹ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		
		createMenu();
		setVisible(true);
		setSize(250,200);
	}
	private void createMenu()
	{
		JMenuBar bar = new JMenuBar();
		JMenu screenMenu = new JMenu("����");
		
		bar.add(new JMenu("����"));
		bar.add(new JMenu("����"));
		bar.add(screenMenu);
		bar.add(new JMenu("�Է�"));
		
		screenMenu.add(new JMenuItem("ȭ��Ȯ��"));
		screenMenu.add(new JMenuItem("������"));
		
		setJMenuBar(bar);
		
	}
	public static void main(String[] args)
	{
		new num1();
	}

}
