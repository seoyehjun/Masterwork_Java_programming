import java.util.*;
import java.io.*;

public class File_find 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		File temp = new File("C:\\");// temp�� ���� �����ִ� ���丮
		Vector<File> upper = new Vector<>();
		
		while(true)
		{
			
			File[] filelist = temp.listFiles();
			System.out.println("["+temp+"]");
			System.out.println("filelist.length: "+filelist.length);
			for(int i = 0; i < filelist.length; i++)// ������丮 �� ���� �����ش�
			{
				//______Ÿ�԰���
				String type ="---";
				if(filelist[i].isFile())type = "file";
				else if(filelist[i].isDirectory())type = "dir ";
			    //----------------------------------------------
				System.out.println(type + "   " + filelist[i].length() + "   " + filelist[i].getName());
			
			}
			
			try
			{
				System.out.print(">>");
				String find_file = scanner.nextLine();// ���� ���丮 ������ ã���������
			
		
				if(find_file.equals("..") == false)
				{
					int j;
					for(j=0;j<filelist.length;j++)//���丮 �� ���ϴ� ���� ã����
					{
						if(find_file.equals(filelist[j].getName())==true)break;
					}
				
					upper.add(temp);//���������ϼ��� �����ε����� ����
					temp = filelist[j];//���� ���丮 ����
				}
				else
				{
					temp =upper.get(upper.size()-1);
					upper.remove(upper.size()-1); 
				}
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.print("��[���]���� ������ ���ų�  �߸��� ���� �����Դϴ�..��");
				continue;
			}
			
		}
		
		

	}

}
