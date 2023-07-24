import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class resetList extends JFrame 
{
	private JTextField tf = new JTextField(10);
	private Vector<String> v = new Vector<>();
	private JList<String> nameList = new JList<String>(v); 
	
	public resetList()
	{
		setTitle("리스트 변경 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("이름 입력후<Enter>키 "));
		c.add(tf);//텍스트 필드 추가
		
		v.add("황기태");
		v.add("이재문");
		nameList.setVisibleRowCount(5);
		nameList.setFixedCellWidth(100);
		c.add(new JScrollPane(nameList));// 리스트 컴포넌트에 스크롤 붙여서 추가
		
		setSize(300,300);
		setVisible(true);
		
		tf.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JTextField t = (JTextField)e.getSource();
				v.add(t.getText());
				t.setText("");
				nameList.setListData(v);
			}
		});
	}
	
	public static void main(String[] args) 
	{
		new resetList();
	}

}
