import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class rem_ram_puck extends JFrame
{
	private JRadioButton [] radio = new JRadioButton[3];
	private String [] text = {"렘","람","팩"};
	private ImageIcon [] image = {
			new ImageIcon("C:\\Users\\우리집\\eclipse-workspace\\실험용\\rem.jpg"),
			new ImageIcon("C:\\Users\\우리집\\eclipse-workspace\\실험용\\ram.jpg"),
			new ImageIcon("C:\\Users\\우리집\\eclipse-workspace\\실험용\\puck.jpg")
	};
	private JLabel imageLabel = new JLabel();
	
	public rem_ram_puck()
	{
		setTitle("라디오버튼 Item Event 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup();
		for(int i=0;i<3;i++)
		{
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);// 버튼 그룹부착
			radioPanel.add(radio[i]);// 패널에도 따로 부착
			radio[i].addItemListener(new MyItemListener());
		}
		
		radio[2].setSelected(true);
		c.add(radioPanel,BorderLayout.NORTH);
		c.add(imageLabel,BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		setSize(1000,1000);
		setVisible(true);
		
	}
	
	class MyItemListener implements ItemListener
	{
		public void itemStateChanged(ItemEvent e)
		{
			if(e.getStateChange() == ItemEvent.DESELECTED)return;//리스너 두번의 호출중 하나는 deselected인 상태이다
			
			if(radio[0].isSelected())imageLabel.setIcon(image[0]);
			else if(radio[1].isSelected())imageLabel.setIcon(image[1]);
			else imageLabel.setIcon(image[2]);
		}
	}
	
	public static void main(String[] args) 
	{
		new rem_ram_puck();
	}

}
