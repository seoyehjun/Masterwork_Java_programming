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
			System.out.println(file+"파일을 읽어 출력합니다.");
			do
			{
				System.out.print(count+": ");count++;
				System.out.println(scanner.nextLine());
			}while(scanner.hasNext());//문자가 남아있는경우
		}
		catch(IOException e)
		{
			System.out.print("파일을 여는데 실패");
		}
	}

}
