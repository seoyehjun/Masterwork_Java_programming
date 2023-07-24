import java.util.Calendar;
import java.util.Scanner;

public class Predict_second
{
	public static void main(String[] args) 
	{
		
		Scanner scanner=new Scanner(System.in);
		int a_gap,b_gap;
		
		/*---------첫번째 사람*---------*/
		System.out.println("시작할려면 Enter>>");
		String entergo1=scanner.nextLine();
		Calendar a_now1=Calendar.getInstance();// 처음 시간할당
		int a_hour1 = a_now1.get(Calendar.SECOND);// 현재 '초'
		int a_min1 = a_now1.get(Calendar.MINUTE);// 1분을 넘기면 진다
		
		System.out.println("현재시간: " + a_hour1);// 현재 '초'보여준다.
		
		// ----------시간흘러가는중**
		System.out.println("10초 예상후 Enter>>");
		String enter1=scanner.nextLine();
		// ----------시간흘러가는중**
		
		Calendar a_now2 = Calendar.getInstance();
		int a_hour2 = a_now2.get(Calendar.SECOND);// Enter쳤을당시 시간
		int a_min2 = a_now2.get(Calendar.MINUTE);// 1분을 넘기면 진다(바로밑에줄에서 계산)
		if(a_min2-a_min1>0)System.exit(0);// 1분이 넘으면 이사람이 진다
		
		System.out.println("현재시간: " + a_hour2);// Enter쳤을당시 시간
		
		//-----------시작했을때와 비교해서 시간차
		if(a_hour2>a_hour1)a_gap=a_hour2-a_hour1;
		else a_gap=(60-a_hour1)+a_hour2;
		
		
		/*---------두번째 사람*---------*/
		System.out.println("시작할려면 Enter>>");
		String entergo2=scanner.nextLine();// 엔터치면 밑에줄에서 Calendar변수 선언하면서 현재시간 할당
		Calendar b_now1=Calendar.getInstance();// 처음 시간할당
		int b_hour1 = b_now1.get(Calendar.SECOND);// 시작 '초' 할당
		int b_min1 = b_now1.get(Calendar.MINUTE);
		
		System.out.println("현재시간: " + b_hour1);
		
		// ----------시간흘러가는중**
		System.out.println("10초 예상후 Enter>>");
		String enter2=scanner.nextLine();
		// ----------시간흘러가는중**
		
		Calendar b_now2 = Calendar.getInstance();
		int b_hour2 = b_now2.get(Calendar.SECOND);
		int b_min2 = b_now2.get(Calendar.MINUTE);
		if(b_min2-b_min1>0)System.exit(0);
		
		System.out.println("현재시간: " + b_hour2);
		
		
		
		/*---------- 최종점검 ---------*/
		if(b_hour2>b_hour1)b_gap=b_hour2-b_hour1;
		else b_gap = (60-b_hour1)+b_hour2;
		
		if(a_gap>b_gap)System.out.print("a가 이겼다a가 이겼다.");
		else System.out.println("b가 이겼다b가이겼다.");
		
	}
}
