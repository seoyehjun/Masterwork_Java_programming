import java.util.*;
import java.io.*;

public class Find_word 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("파일의 이름을 입력하세요>>");
		String file_name = scanner.next();
		File file = new File("C:\\Users\\우리집\\eclipse-workspace\\480부터\\"+file_name);
		Vector<String> vt = new Vector<>();
		try
		{
			FileReader fr = new FileReader(file);
			Scanner scanner2 = new Scanner(fr);
			
			while(scanner2.hasNext())
			{
				vt.add(scanner2.nextLine());
			}
			
			while(true)
			{
				Iterator<String> it = vt.iterator();
				System.out.print("검색할 단어나 문장(띄어쓰기 조심)>>");
				String pattern = scanner.next();
			
				while(it.hasNext())
				{
					String temp = it.next();
					if(temp.equals("그만")==true)break;
					if(temp.indexOf(pattern) != -1)System.out.println(temp);
				}
			}
			
			
		}
		catch(IOException e)
		{
			System.out.print("파일을 읽는데 실패했습니다.");
		}

	}

}
