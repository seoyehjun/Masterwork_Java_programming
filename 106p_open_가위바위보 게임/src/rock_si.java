import java.util.Scanner;

public class rock_si 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		String chals, youngs;
	
		System.out.println("ö���� �� ����?? : ");
        chals=scanner.nextLine();
        System.out.println("���� �� ����? : ");
        youngs=scanner.nextLine();
        
        if(chals.equals("����"))
        {
        	switch(youngs)
        	{
        	case "����":
        		System.out.println("�����ϴ�.");
        		break;
        	case "����":
        		System.out.println("���� �̰���ϴ�.");
        		break;
        	case "��":
        		System.out.println("ö���� �̰���ϴ�.");
        		break;
        	}
        }
        else if(chals.equals("����"))
        {
        	switch(youngs)
        	{
        	case "����":
        		System.out.println("�x���� �̰���ϴ�.");
        		break;
        	case "����":
        		System.out.println("�����ϴ�.");
        		break;
        	case "��":
        		System.out.println("���� �̰���ϴ�.");
        		break;
        	}
        	
        }
        else if(chals.equals("��"))
        {
        	switch(youngs)
        	{
        	case "����":
        		System.out.println("���� �̰���ϴ�.");
        		break;
        	case "����":
        		System.out.println("ö���� �̰���ϴ�.");
        		break;
        	case "��":
        		System.out.println("�����ϴ�.");
        		break;
        	}
        }
     
	}

}
