import java.util.*;
import java.io.*;

public class File_find 
{
	public static void main(String[] args) 
	{
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
				String find_file = scanner.nextLine();// 현재 디렉토리 내에서 찾고싶은파일
			
		
				if(find_file.equals("..") == false)
				{
					int j;
					for(j=0;j<filelist.length;j++)//디렉토리 내 원하는 파일 찾는중
					{
						if(find_file.equals(filelist[j].getName())==true)break;
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
				System.out.print("※[경고]상위 폴더가 없거나  잘못된 파일 접근입니다..※");
				continue;
			}
			
		}
		
		

	}

}
