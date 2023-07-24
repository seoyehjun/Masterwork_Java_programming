import java.util.Scanner;

public class rockwithcom {

	public static void main(String[] args) 
	{	
		Scanner scanner=new Scanner(System.in);
		String str[]= {"가위","바위","보"};
		int num=(int)(Math.random()*10)%3;//math.random()은0이상~1.0미만
		String user=scanner.next();
		
		if(str[num].equals("가위"))
		{
			if(user.equals("가위"))System.out.print("비겼습니다.");
			if(user.equals("바위"))System.out.print("유저가 이김");
			if(user.equals("보"))System.out.print("유저가 짐");
		}
		if(str[num].equals("바위"))
		{
			if(user.equals("가위"))System.out.print("유저가 짐");
			if(user.equals("바위"))System.out.print("비김");
			if(user.equals("보"))System.out.print("유저가 이김");
		}
		if(str[num].equals("보"))
		{
			if(user.equals("가위"))System.out.print("유저가 이김");
			if(user.equals("바위"))System.out.print("유저가 짐");
			if(user.equals("보"))System.out.print("비김");
		}
	}

}
