import java.lang.*;
import java.util.*;
public class smalltoBig 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("문장을 입력하세요");
		String text = scanner.nextLine();
		String arr[] = text.split(" ");// 쪼갠 문자열을 받을곳
		String order = "앙";
		String origin=null, replace=null;
		int count=0;
		
		while(order.equals("그만")==false)
		{
			origin=null;
			replace=null;
			StringTokenizer st;
			do
			{
				System.out.print("명령>>");
				order = scanner.nextLine();
				st=new StringTokenizer(order,"!");//!를기준으로 왼쪽은 대체할 원본 오른쪽을 대체시킬문자
				if(st.countTokens()!=2)System.out.println("잘못된 명령이오\n");
			}while(st.countTokens()!=2);// 명령형식(<origin>!<replace>)-->2개로 쪼개지지 않으면 다시입력
			
			origin = st.nextToken();
			replace = st.nextToken();
			
			//-----------이 밑은 for문을 돌리면서 origin이랑 원본을 비교 같다면 교체(arr[]이랑)
			count=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i].equals(origin)==true) 
				{
					arr[i]=replace;count++;
				}	
			}
			//------------교체 완료
		    
			//------------출력
			for(int i=0;i<arr.length;i++)
		    {
		    	System.out.print(arr[i]);
		    	System.out.print(" ");
		    }
		    System.out.println("\n");
			if(count==0)System.out.println("그런문자 없습니다.\n");//하나도 못찾을경우
		}
		

	}

}
