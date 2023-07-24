import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class num8 extends JFrame 
{
	
	int now =3;
	int lr = 1;// 1(right)혹은  -1(left)
	Vector<ImageIcon> vt = new Vector<>();
	
	public num8()
	{
		setTitle("image Gallery Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		// 라디오버튼
		ButtonGroup group = new ButtonGroup();
		JRadioButton left = new JRadioButton("왼쪽");
		JRadioButton right = new JRadioButton("오른쪽");
		
		group.add(left);
		group.add(right);
		
		c.add(left);
		c.add(right);
		
		left.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				lr=-1;
			}
		});
		right.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				lr=1;
			}
		});
		
		//이미지 읽어오기(이미지 벡터에 저장)
		File file = new File("C:\\Users\\우리집\\eclipse-workspace\\634부터\\violet");
		File [] list = file.listFiles();
		
		for(int i=0; i<list.length; i++)
		{
			vt.add(new ImageIcon(list[i].getPath()));// 파일내 이미지 벡터에 저장
		}
		
		//이미지 라벨
		JLabel imagelabel = new JLabel(vt.get(now));
		c.add(imagelabel);
		imagelabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e)
			{
				now+=lr;
				
				if(now<=0)now+=1;
				if(now>=vt.size())now-=1;
				System.out.println("now: "+now);
				imagelabel.setIcon(vt.get(now));
				System.out.println("now2:"+now);
				
			}
		});
		
		setVisible(true);
		setSize(3000,3000);
	}
	
	public static void main(String[] args)
	{
		new num8();

	}

}
