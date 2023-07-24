import java.io.*;
import java.net.*;
import java.util.*;

public class Server 
{
	public static void main(String[] args) 
	{
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;// ��������(����)
		Socket socket = null;// Ŭ���̾�Ʈ ����(��ſ�)
		Scanner scanner = new Scanner(System.in);
		
		try
		{
			listener = new ServerSocket(9999);// Ŭ���̾�Ʈ������ socket�� ���鶧 ����ǻ���� �ּҿ� ��Ʈ�ѹ�9999�� ������ ����
			System.out.println("������ ��ٸ��� �ֽ��ϴ�....");
			socket = listener.accept();
			System.out.println("����Ǿ����ϴ�.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));// ����� ����ϴ� Ŭ���̾�Ʈ �������κ��� ��ǲ ��Ʈ���� ��´�.(�̰ɷ� �ްٴ�.)
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));// ���� Ŭ���̾�Ʈ �������κ��� �ƿ�ǲ��Ʈ���� ��´�.(�̰ɷ� �������ٴ�.)
			
			while(true)
			{
				String inputMessage = in.readLine();
				if(inputMessage.equalsIgnoreCase("bye"))
				{
					System.out.println("Ŭ���̾�Ʈ���� bye�� ������ �����Ͽ���");
					break;
				}
				System.out.println("Ŭ���̾�Ʈ: "+inputMessage);
				System.out.println("������>>");
				String outputMessage = scanner.nextLine();//Ű����� Ŭ���̾�Ʈ�� ���� �޼��� �Է��Ѵ�.
				out.write(outputMessage +"\n");
				out.flush();
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				scanner.close();
				socket.close();
				listener.close();
			}
			catch(IOException e)
			{
				System.out.println("Ŭ���̾�Ʈ�� ä�� �� ������ �߻��߽��ϴ�.");
			}
		}
		

	}
}
