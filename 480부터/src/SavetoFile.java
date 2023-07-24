import java.util.*;
import java.io.*;

public class SavetoFile 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		
		try
		{
			FileWriter fw = new FileWriter("C:\\Temp\\phone.txt");
			
			while(true)
			{
				System.out.print("이름을 입력하세요>>");
				String name = scanner.nextLine();
				System.out.print(name);
				if(name.equals("그만")==true)break;// "그만"입력시 종료
				fw.write(name);
				
				
				System.out.print("전화번호를 입력하세요>>");
				int phone_num = scanner.nextInt();
				fw.write(phone_num);
				scanner.nextLine();
				
			}
			fw.close();
		}
		catch(IOException e)
		{
			System.out.print("파일을 여는데 실패했습니다.");
		}
	}
}
