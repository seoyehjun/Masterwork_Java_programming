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
			System.out.print("날짜(1~31): ");
			day=scanner.nextInt();
			System.out.print("입력,보기,끝내기");
			choice=scanner.next();
			
			switch(choice)
			{
			case "입력":
				Month.addit(day);
				break;
			case "보기":
				Month.show(day);
				break;
			case "끝내기":
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
		if(work==null)System.out.println("없습니다.");
		else System.out.println(work+"입니다.");
	}
}

class MonthSchedule//이번달 스케쥴 관리
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
