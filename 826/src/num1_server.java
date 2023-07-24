import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num1_server extends JFrame
{
	private static BufferedReader in = null;
	private static Socket socket = null;
	private static ServerSocket ssocket = null;
	private JTextArea ta = new JTextArea();
	public num1_server()
	{
		setTitle("클라이언트로부터");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(ta,BorderLayout.CENTER);
		
		try 
		{
			ssocket = new ServerSocket(9999);
			socket = ssocket.accept();
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} 
		catch (IOException e) 
		{
			System.out.print("연결 오류");
			System.exit(1);
		}
		
		setSize(300,300);
		setVisible(true);
		
		Thread th = new Thread(new read());
		th.start();
	}
	
	class read extends Thread
	{
		public void run()
		{
			while(true)
			{
				String msg = null; 
				try 
				{
					msg = in.readLine();
					ta.append("\n" + "... " + msg + "\n");
					int pos = ta.getText().length();
					ta.setCaretPosition(pos);
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		new num1_server();
	}
}
