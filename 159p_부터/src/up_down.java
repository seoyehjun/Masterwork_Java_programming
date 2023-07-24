import java.util.Scanner;
public class up_down {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int solve= (int)(Math.random()*1000)%100;
		int user;
		int yesno=1;
		int left=0,right=99;
		System.out.println("수를 결정하였습니다. 맞추어 보세요 ");
	
		int i=1;
		
		do
		{
			System.out.println(left+"~"+right);
			System.out.print(i+">>");
			user=scanner.nextInt();
			if(solve>user) 
			{
				System.out.println("더높게!\n");
				left=user;
			}
			else if(solve<user) 
			{
				System.out.println("더낮게!\n");
				right=user;
			}
			else 
			{
				System.out.println("맞앗습니다.");
				System.out.print("다시 하시겟습니까?(1(yes)/0(no)): ");
				yesno=scanner.nextInt();
				solve= (int)(Math.random()*1000)%100;
				left=0;
				right=99;
				
			}
		}while(yesno==1);

	}

}
