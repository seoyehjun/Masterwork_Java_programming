import java.util.Scanner;

public class array_test 
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("몇개의 요소를 입력할건가요?: ");
		int array_count=scanner.nextInt();
		int intarray[]=new int[array_coun`t];
		int instant_count=0,isoverlap=0;
		
		for(int i=0;i<array_count;i++)
		{
			do
			{
				isoverlap=0;
				System.out.print(1+i+"번째 숫자 입력>>");
				intarray[i]=scanner.nextInt();
				for(int j=0;j<instant_count;j++)//처음 입력시엔 반복문 실행안됨
				{
					if(intarray[j]==intarray[i])isoverlap++;
				}
				
			}while(isoverlap>0);
			
			instant_count+=1;
			
		}
		
		for(int i=0;i<array_count;i++)
		{
			System.out.print(intarray[i]);
		}
	}

}
