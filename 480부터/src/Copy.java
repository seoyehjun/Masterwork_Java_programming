import java.util.*;
import java.io.*;

public class Copy 
{
	public static void main(String[] args) 
	{
		File origin_file = new File("C:\\Users\\우리집\\Desktop\\배경화면\\68158.jpg");
		File file = new File("C:\\Users\\우리집\\eclipse-workspace\\480부터\\복사본.jpg");
		try
		{
			FileInputStream frs = new FileInputStream(origin_file);
			FileOutputStream fos = new FileOutputStream(file);
			int count_byte = 0;//count_byte가 한바이트 읽을때마다 +1한다 전체 읽을 양의10/1을 읽으면 다시0으로 초기화된다.(10퍼센트마다 진행상황 알려준다)
			int i = 10;
			int cap = frs.available();
			System.out.println("총 용량은?"+frs.available());
			int count = 0;
			int percent[] = new int[10];
			int c;
		
			while((c = frs.read()) != -1)
			{
				fos.write((byte)c);
			    count_byte++;
				if(count_byte==cap/10)//10퍼센트 찰때마다 출력
				{
					System.out.print(i+"%");
					count_byte = 0;
					i += 10;
				}
			}
			System.out.print("파일 복사가 완료되었습니다.");
			frs.close();
			fos.close();
		}
		catch(IOException e)
		{
			System.out.print("파일을 읽는데 실패했습니다.");
		}

	}
}
