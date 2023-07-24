import java.util.*;
import java.io.*;

public class Appended 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String file_name1,file_name2;
		
		System.out.print("첫번째 파일 이름을 입력하세요>>");
		file_name1 = scanner.next();
		System.out.print("두번째 파일 이름을 입력하세요>>");
		file_name2 = scanner.next();
		byte buff2[] = new byte[10];
		int count2=10;//10은 파일을 읽엇을때 버퍼가 꽉차잇는상태(버퍼의 크기가10)
		File file1 = new File("C:\\Users\\우리집\\eclipse-workspace\\480부터\\"+file_name1);
		File file2 = new File("C:\\Users\\우리집\\eclipse-workspace\\480부터\\"+file_name2);
		String next = "\r\n";
		try
		{
			FileOutputStream fr1 = new FileOutputStream(file1,true);
			FileInputStream fr2 = new FileInputStream(file2);
			
			while(count2==10)
			{
				count2 = fr2.read(buff2,0,count2);
				
				fr1.write(buff2);
			}
			fr1.close();
			fr2.close();
			
		}
		catch(IOException e)
		{
			System.out.print("파일을 읽는데 실패하였습니다.");
		}

	}

}
