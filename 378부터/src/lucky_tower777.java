import java.util.Scanner;
public class lucky_tower777 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int su1,su2,su3;
		int yon1,yon2,yon3;
		String enter;
		
		while(true)
		{
			System.out.print("su시작<Enter입력>>");
			enter=scanner.nextLine();
			/*------- su -------*/
			su1 = ((int)(Math.random()*10))%3 + 1;
			su2 = ((int)(Math.random()*10))%3 + 1;
			su3 = ((int)(Math.random()*10))%3 + 1;
			System.out.println(su1+" "+ su2 +" "+ su3+"\n");
			
			if ( su1==su2 && su1==su3 && su2==su3)
			{
				System.out.print("su가 이겼습니다!");
				break;
			}
			
			System.out.print("yon시작<Enter입력>>");
			enter=scanner.nextLine();
			/*------- yon -------*/
			yon1 = ((int)(Math.random()*10))%3 + 1;
			yon2 = ((int)(Math.random()*10))%3 + 1;
			yon3 = ((int)(Math.random()*10))%3 + 1;
			System.out.print(yon1+" "+yon2+" "+yon3+"\n");
			
			if ( yon1==yon2 && yon1==yon3 && yon2==yon3)
			{
				System.out.println("yon가 이겼습니다!");
				break;
			}
			System.out.println();
		}
		
	}
}
