import java.io.*;
import java.util.*;
public class SmalltoBig 
{
	public static void main(String[] args) 
	{
		File file = new File("c:\\windows\\system.ini");
		char buff[] =new char[1024];
		
		try
		{
			FileReader fr = new FileReader(file);
			Scanner scanner = new Scanner(fr);
			int count=1;
			boolean bool;
			System.out.println(file+"������ �о� ����մϴ�.");
			do
			{
				System.out.print(count+": ");count++;
				System.out.println(scanner.nextLine());
			}while(scanner.hasNext());//���ڰ� �����ִ°��
		}
		catch(IOException e)
		{
			System.out.print("������ ���µ� ����");
		}
	}

}
