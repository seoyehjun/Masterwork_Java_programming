import java.util.*;
import java.io.*;

public class phone_num 
{
	public static void main(String[] args) 
	{
		File file = new File("C:\\Temp\\phone.txt");
		HashMap<String,String> table = new HashMap<>();
		Scanner scanner1 = new Scanner(System.in);
		try
		{
			FileReader fr = new FileReader(file);
			Scanner scanner = new Scanner(fr);
			
			while(scanner.hasNext())
			{
				String key = scanner.next(), num=scanner.next();
				table.put(key,num);
			}
			
			while(true)
			{
				System.out.print("�̸��� �˻��ϼ���>>");
				String find_name = scanner1.next();
				if(find_name.equals("�׸�")==true)break;
				System.out.println(">>"+table.get(find_name));
			}
		}
		catch(IOException e)
		{
			System.out.print("������ ���µ� �����߽��ϴ�.");
		}

	}
}
