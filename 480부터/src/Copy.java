import java.util.*;
import java.io.*;

public class Copy 
{
	public static void main(String[] args) 
	{
		File origin_file = new File("C:\\Users\\�츮��\\Desktop\\���ȭ��\\68158.jpg");
		File file = new File("C:\\Users\\�츮��\\eclipse-workspace\\480����\\���纻.jpg");
		try
		{
			FileInputStream frs = new FileInputStream(origin_file);
			FileOutputStream fos = new FileOutputStream(file);
			int count_byte = 0;//count_byte�� �ѹ���Ʈ ���������� +1�Ѵ� ��ü ���� ����10/1�� ������ �ٽ�0���� �ʱ�ȭ�ȴ�.(10�ۼ�Ʈ���� �����Ȳ �˷��ش�)
			int i = 10;
			int cap = frs.available();
			System.out.println("�� �뷮��?"+frs.available());
			int count = 0;
			int percent[] = new int[10];
			int c;
		
			while((c = frs.read()) != -1)
			{
				fos.write((byte)c);
			    count_byte++;
				if(count_byte==cap/10)//10�ۼ�Ʈ �������� ���
				{
					System.out.print(i+"%");
					count_byte = 0;
					i += 10;
				}
			}
			System.out.print("���� ���簡 �Ϸ�Ǿ����ϴ�.");
			frs.close();
			fos.close();
		}
		catch(IOException e)
		{
			System.out.print("������ �дµ� �����߽��ϴ�.");
		}

	}
}
