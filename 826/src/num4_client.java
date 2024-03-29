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
		setTitle("클라이언트");
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
					out.write(send+"\n");//보내고 
					out.flush();
					int istrue = in.read();// 결과확인
					if(istrue== 1)result.setText("YES");
					else result.setText("NO");
				} 
				catch (IOException e1)
				{
					System.out.print("연결오류");
					System.exit(1);
				}
			}
		});
		c.add(new JLabel("단어 입력"));
		c.add(tf);
		c.add(get_tf);
		c.add(new JLabel("는"));
		c.add(result);
		
		setVisible(true);
		setSize(300,100);
	}
	private void setuptConnection()
	{
		try 
		{
			socket = new Socket("localhost",9911);//서버에 연결요청
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		}
		catch (IOException e) 
		{
			System.out.print("클라이언트에서 setup 오류");
			System.exit(1);
		}
		
	}
	
	public static void main(String[] args) 
	{
		new num4_client();
	}
}
