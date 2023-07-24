import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class open_server extends JFrame implements ActionListener
{
	private BufferedReader in = null;
	private BufferedWriter out = null;
	private ServerSocket listener = null;
	private Socket socket = null;
	private JTextField sender = new JTextField();
	private Receiver receiver = new Receiver();
	
	public open_server()
	{
		setTitle("서버 채팅창");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		sender.addActionListener(this);
		
		receiver.setEditable(false);
		c.add(receiver,BorderLayout.CENTER);
		c.add(sender,BorderLayout.SOUTH);
		
		setSize(300,300);
		setVisible(true);
		
		try
		{
			Setup();
		}
		catch(IOException e)
		{
			System.out.print("연결오류 ");
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
			
			receiver.append("서버: " + msg+"\n");
			int pos = receiver.getText().length();
			receiver.setCaretPosition(pos);
			sender.setText(null);
		}
		catch(IOException e1)
		{
			System.out.print("연결오류");
			System.exit(1);
		}
	}
	private void Setup() throws IOException
	{
		listener = new ServerSocket(9999);// 포트번호를 부여하고 생성
		socket = listener.accept();// 클라이언트 접속 대기
		
		receiver.append("클라이언트 접속 완료"+'\n');
		int pos = receiver.getText().length();
		receiver.setCaretPosition(pos);
		
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	}
	private class Receiver extends JTextArea implements Runnable
	{
		public void run()
		{
			String msg=null;
			System.out.print("server Thread check");
			while(true)
			{
				System.out.print("반복 확인");
				try 
				{
					msg = in.readLine();// read버퍼에서 항시 받는중
					System.out.print(msg+"\n");
				}
				catch(IOException e)
				{
					System.out.print("연결오류");
					System.exit(1);
				}
				this.append("\n  클라이언트 : " + msg );
				int pos = this.getText().length();
				this.setCaretPosition(pos);
			}
		}
	}
	public static void main(String[] args) 
	{
		new open_server();
	}
}
