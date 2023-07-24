import java.util.Calendar;

public class time_now {
	public static void main(String[] args) 
	{
		Calendar now = Calendar.getInstance();
		
		now.set(Calendar.HOUR_OF_DAY,10);	
		
		int hour=now.get(Calendar.HOUR);
		int minute=now.get(Calendar.MINUTE);
		int am_pm=now.get(Calendar.AM_PM);
		System.out.print("현재 시간은 "+hour+"시("+am_pm+")"+minute+"분입니다.");
		
		if(hour>=4&&hour<12)System.out.print("Good Morning");
		else if(hour>=12&&hour<18)System.out.print("Good Afternoon");
		else if(hour>=18&&hour<22)System.out.print("Good Evening");
		else System.out.print("Good Night");
		
	}
}
