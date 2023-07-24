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
	JButton launch= new JButton("���");
	
	public num3_client()
	{
		setTitle("��� Ŭ���̾�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		try
		{
			setup();
		}
		catch(IOException e)
		{
			System.out.print("�������");
			System.exit(1);
		}
		
		c.add(num1);
		c.add(sign);
		c.add(num2);
		c.add(new JLabel("="));
		c.add(num3);
		c.add(launch);
		
		launch.addActionListener(new ActionListener() {//����ư
			public void actionPerformed(ActionEvent e)
			{
				try 
				{
					String num11 = num1.getText().trim();
					String signn = sign.getText().trim();
					String num22 = num2.getText().trim();
					
					if(num11.length()==0||signn.length()==0||num22.length()==0)return;//�Էµ��� ����ĭ�� ������
					
					out.write(num11+"\n");
					out.write(signn+"\n");
					out.write(num22+"\n");
					out.flush();
					
					String result = in.readLine();
					num3.setText(result);// ��� ǥ��
				}
				catch (IOException e1) 
				{
					System.out.print("������� client ��ư ");
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
		System.out.print("������ �����...");
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	}
	public static void main(String [] args)
	{
		new num3_client();
	}
}