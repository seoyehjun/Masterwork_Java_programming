import java.util.Scanner;
public class ArithmeticOperator 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("�ð�, ��, �ʷ� �ٲ� '��'�� �Է��ϼ���");
		int count=scanner.nextInt();
		int minute=count/60;
		int hour= minute/60;
		
		count=count-minute*60;// 60���� ������ ���´�
		minute=minute-hour*60;// 60���� ������ ���´�
		
		System.out.println(hour+"�ð�"+minute+"��"+count+"��");
		
	}

}
