import java.io.*;
import java.util.*;

public class delet_txt 
{
	public static void main(String[] args) 
	{
		File file = new File("C:\\Temp");
		File filelist[] = file.listFiles();
		
		for(int i=0;i<filelist.length;i++)
		{
			String filename_temp = filelist[i].getName();
			if(filename_temp.lastIndexOf(".txt") !=-1) filelist[i].delete();//������ txt�����̸�
		}
		System.out.print("���� ���� �Ϸ�");

	}

}
