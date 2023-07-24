import java.util.*;
import java.io.*;

public class File_find_add
{
	public static void main(String[] args) 
	{
		File_util fu = new File_util();
		Scanner scanner = new Scanner(System.in);
		File temp = new File("C:\\");// temp는 현재 보여주는 디렉토리
		Vector<File> upper = new Vector<>();
		
		while(true)
		{
			
			File[] filelist = temp.listFiles();
			System.out.println("["+temp+"]");
			System.out.println("filelist.length: "+filelist.length);
			
			
			
			
			for(int i = 0; i < filelist.length; i++)// 현재디렉토리 내 파일 보여준다
			{
				//______타입결정
				String type ="---";
				if(filelist[i].isFile())type = "file";
				else if(filelist[i].isDirectory())type = "dir ";
			    //----------------------------------------------
				System.out.println(type + "   " + filelist[i].length() + "   " + filelist[i].getName());
			}
			
			try
			{
				System.out.print(">>");
				String orderset = scanner.nextLine();// 현재 디렉토리 내에서 찾고싶은파일
				
				//----------파일이름을 바꾸는 명령
				if(orderset.indexOf("rename")==0)
				{
					fu.rename(orderset, temp);
					continue;
				}
				
				//-----------파일을 생성하라는 명령
				if(orderset.indexOf("mkdir")==0)
				{
					fu.mkdir(orderset, temp);
					continue;
				}
				
				if(orderset.equals("..") == false)
				{
					int j;
					for(j=0;j<filelist.length;j++)//디렉토리 내 원하는 파일 찾는중
					{
						if(orderset.equals(filelist[j].getName())==true)break;
					}
				
					upper.add(temp);//상위폴더일수록 작은인덱스에 저장
					temp = filelist[j];//현재 디렉토리 수정
				}
				else
				{
					temp =upper.get(upper.size()-1);
					upper.remove(upper.size()-1); 
				}
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("※[경고]상위 폴더가 없거나  잘못된 파일 접근입니다..※");
				continue;
			}
			catch(NoSuchElementException e)
			{
				System.out.println("※[경고]없는 파일입니다.※");
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
		order = st.nextToken();//명령 (mkdir)
		after = st.nextToken();//생성할 파일 이름
		File temp_file = new File(temp,after);
		temp_file.mkdir();
		
	}
}