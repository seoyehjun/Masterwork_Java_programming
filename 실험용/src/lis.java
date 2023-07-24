import javax.swing.*;
import java.awt.*;
 
public class lis extends JFrame
{
	private String [] fruits = {"apple","banana","kiwi","mango","pear","peach","berry","strawberry","blackberry"};
	private ImageIcon [] images= {
			new ImageIcon("C:\\Users\\우리집\\Desktop\\코딩\\material-design-icons-1.0.0\\material-design-icons-1.0.0\\action\\1x_ios\\ic_3d_rotation_black_24dp.png"),
			new ImageIcon("C:\\Users\\우리집\\Desktop\\코딩\\material-design-icons-1.0.0\\material-design-icons-1.0.0\\action\\1x_ios\\ic_account_balance_black_24dp.png"),
			new ImageIcon("C:\\Users\\우리집\\Desktop\\코딩\\material-design-icons-1.0.0\\material-design-icons-1.0.0\\action\\1x_ios\\ic_account_balance_wallet_black_24dp.png")		
	};
	
	public lis()
	{
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JList<String> strList = new JList<>(fruits);
		c.add(strList);
		
		JList<ImageIcon> imageList = new JList<>();
		imageList.setListData(images);
		c.add(imageList);
		
		JList<String> scrollList = new JList<>(fruits);
		c.add(new JScrollPane(scrollList));//과일리스트에 스크롤 달기
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new lis();
	}

}
