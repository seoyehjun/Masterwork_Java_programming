import java.util.Scanner;

public class rockwithcom {

	public static void main(String[] args) 
	{	
		Scanner scanner=new Scanner(System.in);
		String str[]= {"����","����","��"};
		int num=(int)(Math.random()*10)%3;//math.random()��0�̻�~1.0�̸�
		String user=scanner.next();
		
		if(str[num].equals("����"))
		{
			if(user.equals("����"))System.out.print("�����ϴ�.");
			if(user.equals("����"))System.out.print("������ �̱�");
			if(user.equals("��"))System.out.print("������ ��");
		}
		if(str[num].equals("����"))
		{
			if(user.equals("����"))System.out.print("������ ��");
			if(user.equals("����"))System.out.print("���");
			if(user.equals("��"))System.out.print("������ �̱�");
		}
		if(str[num].equals("��"))
		{
			if(user.equals("����"))System.out.print("������ �̱�");
			if(user.equals("����"))System.out.print("������ ��");
			if(user.equals("��"))System.out.print("���");
		}
	}

}
