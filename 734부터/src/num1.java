import java.util.*;

public class num1 
{
	MyThread thread = new MyThread();
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("아무거나 입력");
		String 아무거나 = scanner.nextLine();
	
		Thread th = new Thread(new MyThread());
		th.start();
	}
	
}
class MyThread implements Runnable
	{
		public void run()
		{
			for(int i=1;i<=10;i++)
			{
				System.out.print(i+" ");
			}
			System.out.print("스레드 종료");
		}
	}