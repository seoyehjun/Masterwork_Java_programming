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
			System.out.print("���� �Ʒ��� (x)���� �Է��ϼ��� :");
			left_down_x=scanner.nextInt();
			
			System.out.print("���� �Ʒ��� (y)���� �Է��ϼ��� :");
		    left_down_y=scanner.nextInt();
			
		    System.out.print("������ ���� (x)���� �Է��ϼ��� :");
			right_up_x=scanner.nextInt();
			
			System.out.print("������ ���� (y)���� �Է��ϼ��� :");
		    right_up_y=scanner.nextInt();
			
			
			
		}while(left_down_x>right_up_x&&left_down_y>right_up_y);
		
		if(left_down_x>200||left_down_y>200)System.out.print("�ش� ���簢���� (100,100),(200,200)���簢���� ���� �ʽ��ϴ�.");
		else if(right_up_x<100||right_up_y<100)System.out.print("�ش� ���簢����(100,100),(200,200)���簢���� ���� �ʽ��ϴ�.");
		else System.out.println("�ݽ��ϴ�");

	}

}
