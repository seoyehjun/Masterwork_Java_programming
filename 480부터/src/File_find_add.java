import java.util.*;
import java.io.*;

public class File_find_add
{
	public static void main(String[] args) 
	{
		File_util fu = new File_util();
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
				String orderset = scanner.nextLine();// ���� ���丮 ������ ã���������
				
				//----------�����̸��� �ٲٴ� ���
				if(orderset.indexOf("rename")==0)
				{
					fu.rename(orderset, temp);
					continue;
				}
				
				//-----------������ �����϶�� ���
				if(orderset.indexOf("mkdir")==0)
				{
					fu.mkdir(orderset, temp);
					continue;
				}
				
				if(orderset.equals("..") == false)
				{
					int j;
					for(j=0;j<filelist.length;j++)//���丮 �� ���ϴ� ���� ã����
					{
						if(orderset.equals(filelist[j].getName())==true)break;
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
				System.out.println("��[���]���� ������ ���ų�  �߸��� ���� �����Դϴ�..��");
				continue;
			}
			catch(NoSuchElementException e)
			{
				System.out.println("��[���]���� �����Դϴ�.��");
			}
			
		}
	
	}
	
}
class File_util
{
	void rename (String orderset,File temp)
	{
		File[] filelist = temp.listFiles();
		String order,before,after;
		StringTokenizer st;
		st = new StringTokenizer(orderset," ");
		order = st.nextToken();
		before = st.nextToken();
		after = st.nextToken();
		int q;
		for(q = 0; q<filelist.length; q++)
		{
			if(before.equals(filelist[q].getName())==true)break;
		}
		filelist[q].renameTo(new File(temp.getPath()+"\\"+after));
	
	}
	void mkdir (String orderset,File temp)
	{
		StringTokenizer st;
		String order,after;
		st = new StringTokenizer(orderset," ");
		order = st.nextToken();//��� (mkdir)
		after = st.nextToken();//������ ���� �̸�
		File temp_file = new File(temp,after);
		temp_file.mkdir();
		
	}
}