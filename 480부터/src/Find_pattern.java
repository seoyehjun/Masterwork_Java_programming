import java.util.*;
import java.io.*;

public class Find_pattern 
{
	public static void main(String[] args) 
	{
		File file = new File("C:\\Users\\�츮��\\Desktop\\�ڵ�\\JAVA����\\��ǰJAVA���α׷���(����4��)_�н��ڿ�[20190220]\\words.txt");
		Scanner scanner1 = new Scanner(System.in);
		Vector<String> vt = new Vector<>();
		try
		{
			FileReader fr = new FileReader(file);
			Scanner scanner = new Scanner(fr);
			while(scanner.hasNext())
			{
				vt.add(scanner.next());
			}
			Iterator<String> it = vt.iterator();
			
			System.out.print("������ �Է��ϼ���>>");
			String pattern = scanner1.next();
			
			while (it.hasNext()) 
			{
				String temp = it.next();
				if(temp.indexOf(pattern)==0)System.out.println(temp);
					 
			}
		}
		catch(IOException e)
		{
			System.out.print("������ ã�µ� �����߽��ϴ�.");
		}

	}
}
