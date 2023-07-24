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
	File file = new File("C:\\Users\\우리집\\Desktop\\코딩\\JAVA한잔\\명품JAVA프로그래밍(개정4판)_학습자용[20190220]\\words.txt");
	
	public num4_server()
	{
		setTitle("영어 스펠 체크");
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
			System.out.print("클라이언트와 연결됨");
		
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		}
		catch(IOException e)
		{
			System.out.print("연결오류");
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
					FileReader fr = new FileReader(file);//오타 검수용 파일
					Scanner scanner = new Scanner(fr);
					
					//정답지 확보
					while(scanner.hasNext())
					{
						vt.add(scanner.nextLine());
					}
					
					//클라이언트로 부터 문자를 받아와서 맞는지 판별
					while(true)
					{
						msg = in.readLine();//클라이언트로부터 받은 문자(맞는문자인지 확인해야한다)
						//정답인지 판별
						int i;
						for(i=0;i<vt.size();i++)
						{
							if(msg.equals(vt.get(i))==true)break;
						}
						if(i==vt.size()+1)
						{
							receiver.append(msg+"는 잘못된 문자");
							out.write(-1);//1은 맞는 글자 -1은 틀린문자
						}
						else
						{
							receiver.append(msg+"는 맞는문자");
							out.write(1);
						}
						int pos = receiver.getText().length();
						receiver.setCaretPosition(pos);
					}
					
					
				}
				catch(IOException e)
				{
					System.out.print("연결오류");
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
