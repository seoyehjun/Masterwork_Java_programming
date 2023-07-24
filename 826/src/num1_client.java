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
			System.out.print("연결오류");
			System.exit(1);
		}
		
		while(true)
		{
			String msg = null;
			
			System.out.print("텍스트 입력>> ");
			msg = scanner.nextLine();
			
			try
			{
				out.write(msg+"\n");
				out.flush();
			}
			catch(IOException e)
			{
				System.out.print("연결 오류");
				System.exit(1);
			}
			if(msg.equals("그만")==true)
			{
				System.exit(1);
			}
		}
	}
}
