import java.io.*;
import java.net.*;
import java.util.*;

public class Server 
{
	public static void main(String[] args) 
	{
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;// 서버소켓(대기용)
		Socket socket = null;// 클라이언트 소켓(통신용)
		Scanner scanner = new Scanner(System.in);
		
		try
		{
			listener = new ServerSocket(9999);// 클라이언트에서는 socket을 만들때 현컴퓨터의 주소와 포트넘버9999를 가지고 생성
			System.out.println("연결을 기다리고 있습니다....");
			socket = listener.accept();
			System.out.println("연결되었습니다.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));// 통신을 담당하는 클라이언트 소켓으로부터 인풋 스트림을 얻는다.(이걸로 받겟다.)
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));// 역시 클라이언트 소켓으로부터 아웃풋스트림을 얻는다.(이걸로 내보내겟다.)
			
			while(true)
			{
				String inputMessage = in.readLine();
				if(inputMessage.equalsIgnoreCase("bye"))
				{
					System.out.println("클라이언트에서 bye로 연결을 종료하였음");
					break;
				}
				System.out.println("클라이언트: "+inputMessage);
				System.out.println("보내기>>");
				String outputMessage = scanner.nextLine();//키보드로 클라이언트에 보낼 메세지 입력한다.
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
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
		}
		

	}
}
