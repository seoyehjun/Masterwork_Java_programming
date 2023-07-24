import java.net.*;
import java.io.*;
import java.util.*;

public class num2_server 
{
	public static void main(String[] args) 
	{
		System.out.print("Ÿ�Ӽ����Դϴ�.");
		ServerSocket ssocket = null;
		Socket socket = null;
		BufferedWriter out = null;
		
		try 
		{
			ssocket = new ServerSocket(9994);
			socket = ssocket.accept();//Ŭ���̾�Ʈ ���� ��ٸ�//
			System.out.print("����Ǿ����ϴ�...");
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} 
		catch (IOException e) 
		{
			System.out.print("������� 2");
			System.exit(1);
		}
		
		System.out.print("500ms���� ���� �����ϴ�.");
		Thread th = new Thread(new Count(out));
		th.start();
	}
	
	static class Count extends Thread
	{
		BufferedWriter temp = null;
		public Count(BufferedWriter temp)
		{
			this.temp = temp;
		}
		public void run()
		{
			int count = 0;
			while(true)
			{
				try 
				{
					temp.write(count);
					temp.flush();
					sleep(500);
					count++;
				}
				catch(InterruptedException | IOException e)
				{
					System.out.print("���� �߻�");
					return;
				}
			}
		}
	}
}