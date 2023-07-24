import java.util.*;
public class Hash_money 
{

	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		HashMap<Double,String> table=new HashMap<>();
		String name;
		double score;
		
		for(int i=0;i<5;i++)
		{
			System.out.print("이름>> ");
			name=scanner.next();
			System.out.print("학점>> ");
			score=scanner.nextDouble();
			table.put(score,name);
		}
		
		System.out.print("장학생 선발기준 입력: ");
		double standard=scanner.nextDouble();
		String students[]=new String[5];
		int i=0,count=0;
		Set<Double> keys=table.keySet();// Set에 있는 iterator()사용
		Iterator<Double> it=keys.iterator();
		
		/*--------기준에 맞는사람 가려내기---------*/
		while(it.hasNext())
		{
			double score_key=it.next();
			String name1=table.get(score_key);
	
			if(standard<=score_key)
			{
				students[i++]=table.get(score_key);
				count++;
			}
		}
		
		/*---------출력----------*/
		System.out.println("===========<장학생 명단은>===========");
		for(int j=0;j<count;j++)
		{
			System.out.print(students[j]+"  ");
		}
	}

}
