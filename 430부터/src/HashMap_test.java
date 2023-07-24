import java.util.*;
public class HashMap_test 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		HashMap<String,Integer> nations = new HashMap<String,Integer>();
		
		String nation = "앙";
		
		while(true)
		{
			System.out.print("나라이름을 입력하세요: ");
			nation = scanner.next();
			if(nation.equals("그만")==true)break;
			System.out.print("나라의 인구를 입력하세요(단위: 만): ");
			nations.put(nation, scanner.nextInt());
		}
		System.out.println("\n\n");
		while(true)
		{
			System.out.print("인구검색(나라이름): ");
			nation = scanner.next();
			if(nation.equals("그만")==true)break;
			
			Integer value = nations.get(nation);
			if(value==null)System.out.println("그런나라는 없습니다");//----Integer는  null을 받을수있다.
			else System.out.println("인구는: "+value);
			System.out.println();
		}

	}
}
