import java.util.Scanner;
public class up_down {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int solve= (int)(Math.random()*1000)%100;
		int user;
		int yesno=1;
		int left=0,right=99;
		System.out.println("���� �����Ͽ����ϴ�. ���߾� ������ ");
	
		int i=1;
		
		do
		{
			System.out.println(left+"~"+right);
			System.out.print(i+">>");
			user=scanner.nextInt();
			if(solve>user) 
			{
				System.out.println("������!\n");
				left=user;
			}
			else if(solve<user) 
			{
				System.out.println("������!\n");
				right=user;
			}
			else 
			{
				System.out.println("�¾ѽ��ϴ�.");
				System.out.print("�ٽ� �Ͻðٽ��ϱ�?(1(yes)/0(no)): ");
				yesno=scanner.nextInt();
				solve= (int)(Math.random()*1000)%100;
				left=0;
				right=99;
				
			}
		}while(yesno==1);

	}

}
