import java.util.Calendar;
import java.util.Scanner;

public class Predict_second
{
	public static void main(String[] args) 
	{
		
		Scanner scanner=new Scanner(System.in);
		int a_gap,b_gap;
		
		/*---------ù��° ���*---------*/
		System.out.println("�����ҷ��� Enter>>");
		String entergo1=scanner.nextLine();
		Calendar a_now1=Calendar.getInstance();// ó�� �ð��Ҵ�
		int a_hour1 = a_now1.get(Calendar.SECOND);// ���� '��'
		int a_min1 = a_now1.get(Calendar.MINUTE);// 1���� �ѱ�� ����
		
		System.out.println("����ð�: " + a_hour1);// ���� '��'�����ش�.
		
		// ----------�ð��귯������**
		System.out.println("10�� ������ Enter>>");
		String enter1=scanner.nextLine();
		// ----------�ð��귯������**
		
		Calendar a_now2 = Calendar.getInstance();
		int a_hour2 = a_now2.get(Calendar.SECOND);// Enter������� �ð�
		int a_min2 = a_now2.get(Calendar.MINUTE);// 1���� �ѱ�� ����(�ٷιؿ��ٿ��� ���)
		if(a_min2-a_min1>0)System.exit(0);// 1���� ������ �̻���� ����
		
		System.out.println("����ð�: " + a_hour2);// Enter������� �ð�
		
		//-----------������������ ���ؼ� �ð���
		if(a_hour2>a_hour1)a_gap=a_hour2-a_hour1;
		else a_gap=(60-a_hour1)+a_hour2;
		
		
		/*---------�ι�° ���*---------*/
		System.out.println("�����ҷ��� Enter>>");
		String entergo2=scanner.nextLine();// ����ġ�� �ؿ��ٿ��� Calendar���� �����ϸ鼭 ����ð� �Ҵ�
		Calendar b_now1=Calendar.getInstance();// ó�� �ð��Ҵ�
		int b_hour1 = b_now1.get(Calendar.SECOND);// ���� '��' �Ҵ�
		int b_min1 = b_now1.get(Calendar.MINUTE);
		
		System.out.println("����ð�: " + b_hour1);
		
		// ----------�ð��귯������**
		System.out.println("10�� ������ Enter>>");
		String enter2=scanner.nextLine();
		// ----------�ð��귯������**
		
		Calendar b_now2 = Calendar.getInstance();
		int b_hour2 = b_now2.get(Calendar.SECOND);
		int b_min2 = b_now2.get(Calendar.MINUTE);
		if(b_min2-b_min1>0)System.exit(0);
		
		System.out.println("����ð�: " + b_hour2);
		
		
		
		/*---------- �������� ---------*/
		if(b_hour2>b_hour1)b_gap=b_hour2-b_hour1;
		else b_gap = (60-b_hour1)+b_hour2;
		
		if(a_gap>b_gap)System.out.print("a�� �̰��a�� �̰��.");
		else System.out.println("b�� �̰��b���̰��.");
		
	}
}
