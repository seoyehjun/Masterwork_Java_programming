import java.util.Scanner;

public class MonthSchedule1 {
	

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		MonthSchedule Month=new MonthSchedule();
		String choice;
		int day;
		int yesno=1;
		do
		{
			System.out.print("��¥(1~31): ");
			day=scanner.nextInt();
			System.out.print("�Է�,����,������");
			choice=scanner.next();
			
			switch(choice)
			{
			case "�Է�":
				Month.addit(day);
				break;
			case "����":
				Month.show(day);
				break;
			case "������":
				yesno=0;
				break;
			}
		}while(yesno==1);
		

	}

}
class Day
{
	private String work;
	public void set(String work) {this.work=work;}
	public String get() {return work;}
	public void show()
	{
		if(work==null)System.out.println("�����ϴ�.");
		else System.out.println(work+"�Դϴ�.");
	}
}

class MonthSchedule//�̹��� ������ ����
{
	Scanner scanner=new Scanner(System.in);
	Day days[]=new Day[31];
	
	public MonthSchedule()
	{
		for(int i=0;i<this.days.length;i++)
		{
			this.days[i]=new Day();
		}
	}
	
	void addit(int i)
	{
		String work=scanner.next();
		this.days[i].set(work);
	}
	void show(int i)
	{
		this.days[i].show();
	}
}
