import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.StringTokenizer;

public class num3_server extends JFrame
{
	Receiver receiver = new Receiver();
	Boolean formulastate = true;
	
	public num3_server()
	{
		setTitle("계산 클라이언트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		
		c.add(receiver, BorderLayout.CENTER);
		
		setVisible(true);
		setSize(300,300);
		
		Thread th = new Thread(receiver);
		th.start();
	}
	
	
	
	class Receiver extends JTextArea implements Runnable
	{
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		ServerSocket ssocket = null;
		
		public Receiver()
		{
			try
			{
				setup();
			}
			catch(IOException e)
			{
				System.out.print("연결 오류");
				System.exit(1);
			}
			catch (UnknownHostException e) 
			{
			e.printStackTrace();
		 	}
		}
		
		private void setup() throws IOException throws UnknownHostException
		{
			ssocket = new ServerSocket(8003);
			socket = ssocket.accept();// 클라이언트 대기
			System.out.println("클라이언트와 연결됨..");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.print("in:"+in.hashCode());
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		}
		public void run()
		{
			while(true)
			{
				try
				{
					System.out.print("트라이 블록시작");
					String num1 = in.readLine();
					System.out.print("오류1");
					String sign = in.readLine();
					System.out.print("오류2");
					String num2 = in.readLine();
					System.out.print("오류3");
					
					double result = calc(num1,sign,num2);// 계산결과를 실수로 받는다.
					
					//클라이언트에 결과 전송
					if(formulastate == true)// 올바른 식일때
						out.write(result + "\n");
					else                    //식이 잘못됐을때
						out.write("잘못된 연산 \n");
					out.flush();
					
					//서버창에 띄우기
					int pos = receiver.getText().length();
					receiver.setCaretPosition(pos);
					if(formulastate==true)
						receiver.append(num1+sign+num2+" = "+result+"\n");
					else//식이 잘못됐을때
						receiver.append(num1+sign+num2+"는 잘못된 연산\n");
				}
				catch(IOException e)
				{
					System.out.print("연결오류 서버 Thread에서");
					System.exit(1);
				}
			}
		}
	}
	private double calc (String num1,String sign,String num2)
	{
		int isexist = 0;
		switch(sign)
		{
			case "+":
				isexist++;
				return Double.parseDouble(num1) + Double.parseDouble(num2);
			case "-":
				isexist++;
				return Double.parseDouble(num1) - Double.parseDouble(num2);
			case "*":
				isexist++;
				return Double.parseDouble(num1) * Double.parseDouble(num2);
			case "/":
				isexist++;
				return Double.parseDouble(num1) / Double.parseDouble(num2);
			default:
				if(isexist == 1)formulastate = true;
				else formulastate = false;
							
		}	
		return -1;//임의로 주기위한 반환값(안쓰면 오류)
	}
	public static void main(String[] args) 
	{
		new num3_server();
	}
}
