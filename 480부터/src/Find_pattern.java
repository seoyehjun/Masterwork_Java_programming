import java.util.*;
import java.io.*;

public class Find_pattern 
{
	public static void main(String[] args) 
	{
		File file = new File("C:\\Users\\우리집\\Desktop\\코딩\\JAVA한잔\\명품JAVA프로그래밍(개정4판)_학습자용[20190220]\\words.txt");
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
			
			System.out.print("패턴을 입력하세요>>");
			String pattern = scanner1.next();
			
			while (it.hasNext()) 
			{
				String temp = it.next();
				if(temp.indexOf(pattern)==0)System.out.println(temp);
					 
			}
		}
		catch(IOException e)
		{
			System.out.print("파일을 찾는데 실패했습니다.");
		}

	}
}
