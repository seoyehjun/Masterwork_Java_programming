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
				System.out.print("곱하고자 하는 두 수 입력>>");
				n=scanner.nextInt();
				m=scanner.nextInt();
				go=0;
			}
			catch( InputMismatchException e)
			{
				System.out.println("잘못된 입력입니다(정수입력)");
				go=1;
				scanner.nextLine();
			}
		}while(go==1);
		
		System.out.print(n+"x"+m+"="+n*m);
		scanner.close();

	}

}
