import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class open_client extends JFrame implements ActionListener 
{
	private Receiver receiver = new Receiver();
	private JTextField sender = new JTextField();
	private BufferedReader in = null;
	private BufferedWriter out = null;
	private Socket socket = null;
	
	public open_client()
	{
		setTitle("Ŭ���̾�Ʈ ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		sender.addActionListener(this);
		
		receiver.setEditable(false);
		c.add(receiver,BorderLayout.CENTER);
		c.add(sender,BorderLayout.SOUTH);
		
		setVisible(true);
		setSize(300,300);
		
		try
		{
			setup();// �����۾�
		}
		catch(IOException e)
		{
			System.out.print("���� �����߻�");
			System.exit(1);
		}
		
		Thread th = new Thread(receiver);
		th.start();
	}
	public void actionPerformed(ActionEvent e)
	{
		String msg = sender.getText();
		try
		{
			out.write(msg+"\n");
			out.flush();
		
			receiver.append("Ŭ���̾�Ʈ: "+ msg + '\n');
			int pos = receiver.getText().length();
			receiver.setCaretPosition(pos);
			sender.setText(null);
		}
		catch(IOException e1)
		{
			System.out.print("�������");
			System.exit(1);
		}
	}
	
	private void setup() throws IOException
	{
		socket = new Socket("localhost", 9999);//'������' �ּҿ� ��Ʈ��ȣ
		
		receiver.append("������ ����Ϸ�" + '\n');
		int pos = receiver.getText().length();
		receiver.setCaretPosition(pos);
		
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	}
	
	private class Receiver extends JTextArea implements Runnable
	{
		public void run()
		{
			System.out.print("Ŭ���̾�Ʈ Thread Ȯ��");
			String msg= null;
			while(true)
			{
				try
				{
					msg = in.readLine();
				}
				catch(IOException e)
				{
					System.out.print("�������");
					System.exit(1);
				}
				this.append("\n  ����: " + msg);
				int pos = this.getText().length();
				this.setCaretPosition(pos);  
			}
		}
	}
	
	public static void main(String[] args) 
	{
		new open_client();
	}
}
