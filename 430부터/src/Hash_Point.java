import java.util.*;
public class Hash_Point 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		HashMap<String,Integer> table=new HashMap<>();
		Set<String> sets=table.keySet();
		Iterator<String> it= sets.iterator();
		Iterator<String> it_print = sets.iterator();
		String name;// Ű��(���̸�)
		int point;// value(�� ����Ʈ)
		int count;//����Ʈ �������θ� �˱����ؼ�
		
		while(true)
		{
			/*-----�̸��� ����Ʈ �Է¹޴´�-----*/
			System.out.print("�̸��Է�>>");
			name = scanner.next();
			if(name.equals("�׸�")==true)break;// �Է�����
			System.out.print("�߰�������Ʈ>>");
			point = scanner.nextInt();
			
			/*-----���̸� �ߺ����� �Ǻ�(�̹� �մ��̸��̶�� ���� ������Ų��)-----*/
			count = 0;
			while(it.hasNext()==true)
			{
				if(name.equals(it.next())==true)count++;
			}
			
			/*----- ���� �ִºκ� -----*/
			if(count>=1)//=�÷��մ� ���ΰ��
			{
				int temp = table.get(name);
				temp+=point;//temp�� �÷�����Ʈ  point�� ���ξ��� ����Ʈ
				table.remove(name);// ���� ������� ��ä
				table.put(name,temp);//�������ִ� ����Ʈ�� ���ξ��� ����Ʈ�� �����ؼ� �־���.
			}
			else//=ó�� ����Ʈ�� �ִ� ��
			{
				table.put(name,point);//���Ӱ� ������� �Ҵ�
			}
			
			/*-----Ű�°� �ݺ��� ������Ʈ-----*/
			sets = table.keySet();
			it_print =sets.iterator();
			it = sets.iterator();
			
			/*-----���-----*/
			while(it_print.hasNext()==true)
			{
				String temp_name=it_print.next();
				System.out.print("("+temp_name+","+table.get(temp_name)+")");
			}
			
		}

	}

}
