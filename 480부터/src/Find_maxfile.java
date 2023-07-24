import java.util.*;
import java.io.*;

public class Find_maxfile 
{
	public static void main(String[] args) 
	{
		File forder = new File("C:\\");
		File list[] = new File[100];
		File max;
		list = forder.listFiles();
		
		max = list[0];
		System.out.println("file"+1+list[0].getName()+"의 크기:"+list[0].length());
		for(int i=1; i<list.length; i++)
		{
			System.out.println("file"+list[i].getName()+"의 크기:"+list[i].length());
			if(max.length()<list[i].length())max = list[i];
		}
		System.out.print("최대파일"+max.getName()+"의 크기는 : "+max.length());
		
	}
	
}
