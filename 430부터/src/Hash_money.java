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
			System.out.print("�̸�>> ");
			name=scanner.next();
			System.out.print("����>> ");
			score=scanner.nextDouble();
			table.put(score,name);
		}
		
		System.out.print("���л� ���߱��� �Է�: ");
		double standard=scanner.nextDouble();
		String students[]=new String[5];
		int i=0,count=0;
		Set<Double> keys=table.keySet();// Set�� �ִ� iterator()���
		Iterator<Double> it=keys.iterator();
		
		/*--------���ؿ� �´»�� ��������---------*/
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
		
		/*---------���----------*/
		System.out.println("===========<���л� �����>===========");
		for(int j=0;j<count;j++)
		{
			System.out.print(students[j]+"  ");
		}
	}

}
