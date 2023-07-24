import java.util.Scanner;
public class Hit_me 
{

	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		
		int left_down_x;
		int left_down_y;
		int right_up_x;
		int right_up_y;
		
		do
		{
			System.out.print("왼쪽 아래의 (x)값을 입력하세요 :");
			left_down_x=scanner.nextInt();
			
			System.out.print("왼쪽 아래의 (y)값을 입력하세요 :");
		    left_down_y=scanner.nextInt();
			
		    System.out.print("오른쪽 위의 (x)값을 입력하세요 :");
			right_up_x=scanner.nextInt();
			
			System.out.print("오른쪽 위의 (y)값을 입력하세요 :");
		    right_up_y=scanner.nextInt();
			
			
			
		}while(left_down_x>right_up_x&&left_down_y>right_up_y);
		
		if(left_down_x>200||left_down_y>200)System.out.print("해당 직사각형은 (100,100),(200,200)직사각형에 닫지 않습니다.");
		else if(right_up_x<100||right_up_y<100)System.out.print("해당 직사각형은(100,100),(200,200)직사각형에 닫지 않습니다.");
		else System.out.println("닫습니다");

	}

}
