import java.util.InputMismatchException;
import java.util.Scanner;

public class exception15 {

	public static void main(String[] args)
	{
		int go=1;
		Scanner scanner=new Scanner(System.in);
		
		int n=0;
		int m=0;
		do
		{
			try
			{
				System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
				n=scanner.nextInt();
				m=scanner.nextInt();
				go=0;
			}
			catch( InputMismatchException e)
			{
				System.out.println("�߸��� �Է��Դϴ�(�����Է�)");
				go=1;
				scanner.nextLine();
			}
		}while(go==1);
		
		System.out.print(n+"x"+m+"="+n*m);
		scanner.close();

	}

}
