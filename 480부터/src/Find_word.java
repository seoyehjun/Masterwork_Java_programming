import java.util.*;
import java.io.*;

public class Find_word 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �̸��� �Է��ϼ���>>");
		String file_name = scanner.next();
		File file = new File("C:\\Users\\�츮��\\eclipse-workspace\\480����\\"+file_name);
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
				System.out.print("�˻��� �ܾ ����(���� ����)>>");
				String pattern = scanner.next();
			
				while(it.hasNext())
				{
					String temp = it.next();
					if(temp.equals("�׸�")==true)break;
					if(temp.indexOf(pattern) != -1)System.out.println(temp);
				}
			}
			
			
		}
		catch(IOException e)
		{
			System.out.print("������ �дµ� �����߽��ϴ�.");
		}

	}

}
