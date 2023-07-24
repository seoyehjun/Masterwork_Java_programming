import java.util.*;
public class nation_capital 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		HashMap<String,String> table=new HashMap<>();
		int choice=0;
		int count=0;
		
		while(choice!=3)
		{
			System.out.println("입력(1), 퀴즈(2), 종료(3)");
			choice = scanner.nextInt();
			switch(choice)
			{
			case 1:// 선지추가
				System.out.print("나라 입력>>");
				String nation=scanner.next();
				System.out.print("수도 입력>>");
				String capital=scanner.next();
				table.put(nation,capital);
				count++;// 해쉬맵 안 요소갯수
				break;
				
			case 2:// 퀴즈
				
				/*------랜덤하게 key값 하나를 얻은과정------*/
				int hash_index=((int)(Math.random()*10))%count;// hash_index는 hashMap안의 요소갯수에따라 범위가 달라짐
				Set<String> keys = table.keySet();
				Iterator<String> it = keys.iterator();
				String random_key=it.next();//hash_index가0일때는 HashMap키중 첫번째키가 쓰인다.
				for(int i=0;i<hash_index;i++)// 요소갯수내에서 랜덤하게 반복하여 랜덤한 키값을 얻어낸다
				{
					random_key=it.next();
				}
				
				/*------퀴즈 답 입력받는곳-----*/
				System.out.print(random_key+"의 수도는?");
				String answer = scanner.next();
				if(answer.equals(table.get(random_key)))System.out.print("정답!");
				else System.out.print("아닙니다!!");
				break;
				
				
			
			case 3:
			
				break;
			}
		}
	}
}
