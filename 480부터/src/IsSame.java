import java.util.*;
import java.io.*;


public class IsSame 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� ù��° ���� �̸�1>>");
		String file1_name = scanner.next();
		
		System.out.print("���� �ι�° ���� �̸�2>>");
		String file2_name = scanner.next();
		
		File file1 = new File("C:\\Users\\�츮��\\eclipse-workspace\\480����\\"+file1_name);
		File file2 = new File("C:\\Users\\�츮��\\eclipse-workspace\\480����\\"+file2_name);
		byte buff1[] = new byte[1024], buff2[] = new byte[1024];
		int read_count1=1024,read_count2=1024;
		int IsSame=0;//���α׷� ��������0�̸� �������� ���ٴ¶�
		try
		{
			FileInputStream fis1 = new FileInputStream(file1);
			FileInputStream fis2 = new FileInputStream(file2);
			
			while(read_count1==1024||read_count2==1024)// ������ �������о����� ���۸� ��ä���(1024)�ٽùݺ�
			{
				read_count1 = fis1.read(buff1);
				read_count2 = fis2.read(buff2);
				System.out.println("read_count1: "+read_count1+"  read_count2: "+read_count2);
				
				if(read_count1 != read_count2)
				{
					System.out.print("�� ������ �����ʽ��ϴ�.");
					IsSame++;
					break;
					
				}
				for(int i=0;i<read_count1;i++)
				{
					System.out.println("buff1:"+(char)buff1[i]+" buff2:"+(char)buff2[i]);
					if(buff1[i]!=buff2[i])
					{
						System.out.print("�� ������ �����ʽ��ϴ�.");
						IsSame++;
						break;
					}
				}
			}
			if(IsSame==0)System.out.print("�������� �����ϴ�.");
		}
		catch(IOException e)
		{
			System.out.print("������ ã�� ���߽��ϴ�.");
		}
		
		

	}
}
