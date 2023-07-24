import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num3 extends JFrame
{
	JTextField tf = new JTextField(10);
	JButton button = new JButton("���");
	
	String [] coin_list= {"������","����","õ��","500��","100��","50��","10��","1��"};
	JLabel[] field_list = new JLabel[8];
	
	int tot;
	int won_count[] = new int[8];
	int won[] = {50000,10000,1000,500,100,50,10,1};
	
	public num3()
	{
		setTitle("coin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				tot=Integer.parseInt(tf.getText());
				tf.setText("");
				for(int i=0;i<8;i++)
				{
					won_count[i]=tot/won[i];// ���� ��
					tot-=(won_count[i]*won[i]);
				}
				for(int i=0;i<8;i++)
				{
					field_list[i].setText(Integer.toString(won_count[i]));
				}
			}
		});
		
		c.add(new read());
		c.add(new account());
		
		setVisible(true);
		setSize(100,300);
		
	}
	class read extends JPanel
	{
		public read()
		{
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			c.add(new JLabel("�ݾ�"));
			c.add(tf);
			c.add(button);
		}
	}
	class account extends JPanel
	{
		
		public account()
		{
			Container c = getContentPane();
			c.setLayout(new GridLayout(10,2));
			
			for(int i=0;i<8;i++)
			{
				c.add(new JLabel(coin_list[i]));
				field_list[i] = new JLabel("0");
				field_list[i].setBackground(Color.white);
				c.add(field_list[i]);
			}
		}
	}
	public static void main(String[] args) 
	{
		new num3();
	}

}
