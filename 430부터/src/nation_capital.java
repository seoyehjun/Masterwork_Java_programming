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
			System.out.println("�Է�(1), ����(2), ����(3)");
			choice = scanner.nextInt();
			switch(choice)
			{
			case 1:// �����߰�
				System.out.print("���� �Է�>>");
				String nation=scanner.next();
				System.out.print("���� �Է�>>");
				String capital=scanner.next();
				table.put(nation,capital);
				count++;// �ؽ��� �� ��Ұ���
				break;
				
			case 2:// ����
				
				/*------�����ϰ� key�� �ϳ��� ��������------*/
				int hash_index=((int)(Math.random()*10))%count;// hash_index�� hashMap���� ��Ұ��������� ������ �޶���
				Set<String> keys = table.keySet();
				Iterator<String> it = keys.iterator();
				String random_key=it.next();//hash_index��0�϶��� HashMapŰ�� ù��°Ű�� ���δ�.
				for(int i=0;i<hash_index;i++)// ��Ұ��������� �����ϰ� �ݺ��Ͽ� ������ Ű���� ����
				{
					random_key=it.next();
				}
				
				/*------���� �� �Է¹޴°�-----*/
				System.out.print(random_key+"�� ������?");
				String answer = scanner.next();
				if(answer.equals(table.get(random_key)))System.out.print("����!");
				else System.out.print("�ƴմϴ�!!");
				break;
				
				
			
			case 3:
			
				break;
			}
		}
	}
}
