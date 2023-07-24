import java.util.Scanner;
public class ArithmeticOperator 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("시간, 분, 초로 바꿀 '초'를 입력하세요");
		int count=scanner.nextInt();
		int minute=count/60;
		int hour= minute/60;
		
		count=count-minute*60;// 60안의 단위만 남는다
		minute=minute-hour*60;// 60안의 단위만 남는다
		
		System.out.println(hour+"시간"+minute+"분"+count+"초");
		
	}

}
