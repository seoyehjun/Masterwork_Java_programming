import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class num3_client extends JFrame
{
	BufferedReader in = null;
	BufferedWriter out = null;
	Socket socket = null;
	JTextField num1,sign,num2,num3;
	JButton launch= new JButton("계산");
	
	public num3_client()
	{
		setTitle("계산 클라이언트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		try
		{
			setup();
		}
		catch(IOException e)
		{
			System.out.print("연결오류");
			System.exit(1);
		}
		
		c.add(num1);
		c.add(sign);
		c.add(num2);
		c.add(new JLabel("="));
		c.add(num3);
		c.add(launch);
		
		launch.addActionListener(new ActionListener() {//계산버튼
			public void actionPerformed(ActionEvent e)
			{
				try 
				{
					String num11 = num1.getText().trim();
					String signn = sign.getText().trim();
					String num22 = num2.getText().trim();
					
					if(num11.length()==0||signn.length()==0||num22.length()==0)return;//입력되지 않은칸이 있을때
					
					out.write(num11+"\n");
					out.write(signn+"\n");
					out.write(num22+"\n");
					out.flush();
					
					String result = in.readLine();
					num3.setText(result);// 결과 표시
				}
				catch (IOException e1) 
				{
					System.out.print("연결오류 client 버튼 ");
					System.exit(1);
				}
			}
		});
		
		setVisible(true);
		setSize(300,300);
	}
	private void setup() throws IOException 
	{
		socket = new Socket("localhost",8003);
		System.out.print("서버와 연결됨...");
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	}
	public static void main(String [] args)
	{
		new num3_client();
	}
}