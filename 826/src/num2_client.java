import java.io.*;
import java.net.*;
import java.util.*;

public class num2_client 
{
	public static void main(String[] args) 
	{
		BufferedReader in = null;
		Socket socket = null;
		
		try
		{
			socket = new Socket("localhost",9994);//���� �����û
			System.out.print("������ �����Ͽ����ϴ�...");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			 
		}
		catch(IOException e)
		{
			System.out.print("�������");
			System.exit(1);
		}
		while(true)
		{
			int count = 0;
			System.out.print("������ �ð�");
			try
			{
				count = in.read();//�������� �Ҿ����
				System.out.print("\n"+" "+Integer.toString(count));
			}
			catch(IOException e)
			{
				System.out.print("�������1");
				System.exit(1);
			}
			if(count == 19)break;
		}
	}
	
	
}