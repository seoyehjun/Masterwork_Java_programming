import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.StringTokenizer;

public class num3_server extends JFrame
{
	Receiver receiver = new Receiver();
	Boolean formulastate = true;
	
	public num3_server()
	{
		setTitle("��� Ŭ���̾�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		
		c.add(receiver, BorderLayout.CENTER);
		
		setVisible(true);
		setSize(300,300);
		
		Thread th = new Thread(receiver);
		th.start();
	}
	
	
	
	class Receiver extends JTextArea implements Runnable
	{
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		ServerSocket ssocket = null;
		
		public Receiver()
		{
			try
			{
				setup();
			}
			catch(IOException e)
			{
				System.out.print("���� ����");
				System.exit(1);
			}
			catch (UnknownHostException e) 
			{
			e.printStackTrace();
		 	}
		}
		
		private void setup() throws IOException throws UnknownHostException
		{
			ssocket = new ServerSocket(8003);
			socket = ssocket.accept();// Ŭ���̾�Ʈ ���
			System.out.println("Ŭ���̾�Ʈ�� �����..");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.print("in:"+in.hashCode());
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		}
		public void run()
		{
			while(true)
			{
				try
				{
					System.out.print("Ʈ���� ���Ͻ���");
					String num1 = in.readLine();
					System.out.print("����1");
					String sign = in.readLine();
					System.out.print("����2");
					String num2 = in.readLine();
					System.out.print("����3");
					
					double result = calc(num1,sign,num2);// ������� �Ǽ��� �޴´�.
					
					//Ŭ���̾�Ʈ�� ��� ����
					if(formulastate == true)// �ùٸ� ���϶�
						out.write(result + "\n");
					else                    //���� �߸�������
						out.write("�߸��� ���� \n");
					out.flush();
					
					//����â�� ����
					int pos = receiver.getText().length();
					receiver.setCaretPosition(pos);
					if(formulastate==true)
						receiver.append(num1+sign+num2+" = "+result+"\n");
					else//���� �߸�������
						receiver.append(num1+sign+num2+"�� �߸��� ����\n");
				}
				catch(IOException e)
				{
					System.out.print("������� ���� Thread����");
					System.exit(1);
				}
			}
		}
	}
	private double calc (String num1,String sign,String num2)
	{
		int isexist = 0;
		switch(sign)
		{
			case "+":
				isexist++;
				return Double.parseDouble(num1) + Double.parseDouble(num2);
			case "-":
				isexist++;
				return Double.parseDouble(num1) - Double.parseDouble(num2);
			case "*":
				isexist++;
				return Double.parseDouble(num1) * Double.parseDouble(num2);
			case "/":
				isexist++;
				return Double.parseDouble(num1) / Double.parseDouble(num2);
			default:
				if(isexist == 1)formulastate = true;
				else formulastate = false;
							
		}	
		return -1;//���Ƿ� �ֱ����� ��ȯ��(�Ⱦ��� ����)
	}
	public static void main(String[] args) 
	{
		new num3_server();
	}
}