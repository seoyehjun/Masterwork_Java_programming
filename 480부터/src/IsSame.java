import java.util.*;
import java.io.*;


public class IsSame 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("비교할 첫번째 파일 이름1>>");
		String file1_name = scanner.next();
		
		System.out.print("비교할 두번째 파일 이름2>>");
		String file2_name = scanner.next();
		
		File file1 = new File("C:\\Users\\우리집\\eclipse-workspace\\480부터\\"+file1_name);
		File file2 = new File("C:\\Users\\우리집\\eclipse-workspace\\480부터\\"+file2_name);
		byte buff1[] = new byte[1024], buff2[] = new byte[1024];
		int read_count1=1024,read_count2=1024;
		int IsSame=0;//프로그램 마지막에0이면 두파일이 같다는뜻
		try
		{
			FileInputStream fis1 = new FileInputStream(file1);
			FileInputStream fis2 = new FileInputStream(file2);
			
			while(read_count1==1024||read_count2==1024)// 이전에 파일을읽엇을때 버퍼를 꽉채우면(1024)다시반복
			{
				read_count1 = fis1.read(buff1);
				read_count2 = fis2.read(buff2);
				System.out.println("read_count1: "+read_count1+"  read_count2: "+read_count2);
				
				if(read_count1 != read_count2)
				{
					System.out.print("두 파일은 같지않습니다.");
					IsSame++;
					break;
					
				}
				for(int i=0;i<read_count1;i++)
				{
					System.out.println("buff1:"+(char)buff1[i]+" buff2:"+(char)buff2[i]);
					if(buff1[i]!=buff2[i])
					{
						System.out.print("두 파일은 같지않습니다.");
						IsSame++;
						break;
					}
				}
			}
			if(IsSame==0)System.out.print("두파일은 같습니다.");
		}
		catch(IOException e)
		{
			System.out.print("파일을 찾지 못했습니다.");
		}
		
		

	}
}
