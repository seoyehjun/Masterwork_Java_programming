import java.util.Scanner;

public class array_test 
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("��� ��Ҹ� �Է��Ұǰ���?: ");
		int array_count=scanner.nextInt();
		int intarray[]=new int[array_coun`t];
		int instant_count=0,isoverlap=0;
		
		for(int i=0;i<array_count;i++)
		{
			do
			{
				isoverlap=0;
				System.out.print(1+i+"��° ���� �Է�>>");
				intarray[i]=scanner.nextInt();
				for(int j=0;j<instant_count;j++)//ó�� �Է½ÿ� �ݺ��� ����ȵ�
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
