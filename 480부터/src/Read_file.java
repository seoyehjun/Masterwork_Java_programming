import java.io.*;
import java.util.*;
public class Read_file 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		File file = new File("C:\\Temp\\phone1.txt");
		char buff[]= new char[100];
		
		try
		{
			FileReader fr = new FileReader(file);
			
			int count = fr.read(buff);
			
			for(int i=0;i<count;i++)
			{
				System.out.print(buff[i]); 
			}
		}
		catch(IOException e)
		{
			System.out.print("파일을 읽는데 실패했습니다.");
		}
		

	}

}
