import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.net.*;

public class num4_client extends JFrame 
{
	private JTextField tf = new JTextField(10);
    private	JLabel get_tf = new JLabel();
	private JLabel result = new JLabel();
	private BufferedReader in = null;
	private BufferedWriter out = null;
	private Socket socket = null;
	
	public num4_client()
	{
		setTitle("Ŭ���̾�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	
		setuptConnection();
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String send = tf.getText().trim();
				get_tf.setText(send);
				tf.setText("");
				try 
				{
					out.write(send+"\n");//������ 
					out.flush();
					int istrue = in.read();// ���Ȯ��
					if(istrue== 1)result.setText("YES");
					else result.setText("NO");
				} 
				catch (IOException e1)
				{
					System.out.print("�������");
					System.exit(1);
				}
			}
		});
		c.add(new JLabel("�ܾ� �Է�"));
		c.add(tf);
		c.add(get_tf);
		c.add(new JLabel("��"));
		c.add(result);
		
		setVisible(true);
		setSize(300,100);
	}
	private void setuptConnection()
	{
		try 
		{
			socket = new Socket("localhost",9911);//������ �����û
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		}
		catch (IOException e) 
		{
			System.out.print("Ŭ���̾�Ʈ���� setup ����");
			System.exit(1);
		}
		
	}
	
	public static void main(String[] args) 
	{
		new num4_client();
	}
}