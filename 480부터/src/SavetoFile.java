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
				System.out.print("�̸��� �Է��ϼ���>>");
				String name = scanner.nextLine();
				System.out.print(name);
				if(name.equals("�׸�")==true)break;// "�׸�"�Է½� ����
				fw.write(name);
				
				
				System.out.print("��ȭ��ȣ�� �Է��ϼ���>>");
				int phone_num = scanner.nextInt();
				fw.write(phone_num);
				scanner.nextLine();
				
			}
			fw.close();
		}
		catch(IOException e)
		{
			System.out.print("������ ���µ� �����߽��ϴ�.");
		}
	}
}
