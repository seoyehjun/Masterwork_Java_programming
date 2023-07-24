import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import java.util.*;


public class num4_server extends JFrame
{
	Receiver receiver = new Receiver();
	BufferedReader in = null;
	BufferedWriter out = null;
	ServerSocket ssocket = null;
	Socket socket = null;
	File file = new File("C:\\Users\\�츮��\\Desktop\\�ڵ�\\JAVA����\\��ǰJAVA���α׷���(����4��)_�н��ڿ�[20190220]\\words.txt");
	
	public num4_server()
	{
		setTitle("���� ���� üũ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		setupConnection();
		c.add(receiver,BorderLayout.CENTER);
		
		setVisible(true);
		setSize(300,300);
		
		Thread th = new Thread(receiver);
		th.start();
	}
	private void setupConnection() 
	{
		try
		{
			ssocket = new ServerSocket(9911);
			socket = ssocket.accept();
			System.out.print("Ŭ���̾�Ʈ�� �����");
		
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		}
		catch(IOException e)
		{
			System.out.print("�������");
			System.exit(1);
		}
	}
	
	private class Receiver extends JTextArea implements Runnable
	{
		Vector<String> vt = new Vector<>();
		public void run()
		{
			while(true)
			{
				String msg = "";
				try
				{
					FileReader fr = new FileReader(file);//��Ÿ �˼��� ����
					Scanner scanner = new Scanner(fr);
					
					//������ Ȯ��
					while(scanner.hasNext())
					{
						vt.add(scanner.nextLine());
					}
					
					//Ŭ���̾�Ʈ�� ���� ���ڸ� �޾ƿͼ� �´��� �Ǻ�
					while(true)
					{
						msg = in.readLine();//Ŭ���̾�Ʈ�κ��� ���� ����(�´¹������� Ȯ���ؾ��Ѵ�)
						//�������� �Ǻ�
						int i;
						for(i=0;i<vt.size();i++)
						{
							if(msg.equals(vt.get(i))==true)break;
						}
						if(i==vt.size()+1)
						{
							receiver.append(msg+"�� �߸��� ����");
							out.write(-1);//1�� �´� ���� -1�� Ʋ������
						}
						else
						{
							receiver.append(msg+"�� �´¹���");
							out.write(1);
						}
						int pos = receiver.getText().length();
						receiver.setCaretPosition(pos);
					}
					
					
				}
				catch(IOException e)
				{
					System.out.print("�������");
					System.exit(1);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		new num4_server();
	}

}