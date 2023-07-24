import java.util.Scanner;

public class rock_si 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		String chals, youngs;
	
		System.out.println("철수가 낼 것은?? : ");
        chals=scanner.nextLine();
        System.out.println("영희가 낼 것은? : ");
        youngs=scanner.nextLine();
        
        if(chals.equals("가위"))
        {
        	switch(youngs)
        	{
        	case "가위":
        		System.out.println("비겼습니다.");
        		break;
        	case "바위":
        		System.out.println("영희가 이겼습니다.");
        		break;
        	case "보":
        		System.out.println("철수가 이겼습니다.");
        		break;
        	}
        }
        else if(chals.equals("바위"))
        {
        	switch(youngs)
        	{
        	case "가위":
        		System.out.println("쳘수가 이겼습니다.");
        		break;
        	case "바위":
        		System.out.println("비겼습니다.");
        		break;
        	case "보":
        		System.out.println("영희가 이겼습니다.");
        		break;
        	}
        	
        }
        else if(chals.equals("보"))
        {
        	switch(youngs)
        	{
        	case "가위":
        		System.out.println("영희가 이겼습니다.");
        		break;
        	case "바위":
        		System.out.println("철수가 이겼습니다.");
        		break;
        	case "보":
        		System.out.println("비겼습니다.");
        		break;
        	}
        }
     
	}

}
