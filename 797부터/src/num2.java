import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.*;

public class num2 extends JFrame
{
	Image backimage = null;
	MyPanel panel = new MyPanel();
	public num2()
	{
		setTitle("배경화면 설정하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		setContentPane(panel);
		
		setVisible(true);
		setSize(250,250);
	}
	class MyPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponents(g);
			g.drawImage(backimage, 0, 0, getWidth(), getHeight(), this);
		}
	}
	public void createMenu()
	{
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem item = new JMenuItem("열기");
		
		mb.add(fileMenu);
		fileMenu.add(item);
		item.addActionListener(new MyAction());
		
		setJMenuBar(mb);
	}
	class MyAction implements ActionListener
	{
		private JFileChooser chooser;
		public MyAction()
		{
			chooser= new JFileChooser();
		}
		public void actionPerformed(ActionEvent e)
		{
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images","jpg","gif");
			chooser.setFileFilter(filter);
			
			int choice = chooser.showOpenDialog(null);
			
			if(choice != JFileChooser.APPROVE_OPTION)
			{
				JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.","경고",JOptionPane.WARNING_MESSAGE);
				
				return;
			}
			String filePath = chooser.getSelectedFile().getPath();
			System.out.println("Path: "+filePath);
			ImageIcon temp = new ImageIcon(filePath);
			backimage = temp.getImage();
			
			panel.repaint();
		}
	}
	
	public static void main(String[] args) 
	{
		new num2();
	}
}
