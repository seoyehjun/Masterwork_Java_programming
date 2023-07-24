import java.io.*;

import java.net.*;
import java.util.*;

import javax.swing.JFrame;
public class num1_client 
{
	private static BufferedWriter out = null;
	private static BufferedReader in = null;
	private static Socket socket = null;
	

	public static void main(String[] args) 
	{	
	
		Scanner scanner = new Scanner(System.in);
		try 
		{
			socket = new Socket("localhost",9999);
		
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		}
		catch(IOException e)
		{
			System.out.print("�������");
			System.exit(1);
		}
		
		while(true)
		{
			String msg = null;
			
			System.out.print("�ؽ�Ʈ �Է�>> ");
			msg = scanner.nextLine();
			
			try
			{
				out.write(msg+"\n");
				out.flush();
			}
			catch(IOException e)
			{
				System.out.print("���� ����");
				System.exit(1);
			}
			if(msg.equals("�׸�")==true)
			{
				System.exit(1);
			}
		}
	}
}
