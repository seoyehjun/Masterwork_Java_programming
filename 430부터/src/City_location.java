import java.util.*;
public class City_location 
{
	public static void main(String[] args) 
	{
		HashMap<String, Location> table=new HashMap<>();
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			System.out.print("����, ����, �浵.");
			table.put(scanner.next(),new Location(scanner.nextInt(),scanner.nextInt()));
		}
		
		
		/*����� ���ÿ� ��ġ ���*/
		Set<String> keys = table.keySet();
		Iterator<String> it = keys.iterator();
		System.out.println("-----------------------");
		while(it.hasNext()==true)
		{
			String key= it.next();
			System.out.println(key + ": "+ table.get(key));
		}
		System.out.println("-----------------------");
		
		/*������ġ �˻�*/
		String choice="��";
		while(true)
		{
			System.out.print("���� �̸�>>");
			choice = scanner.next();
			if(choice.equals("�׸�")==true)break;
			System.out.println(table.get(choice));
		}

	}
}

class Location
{
	int ����,�浵;
    Location(int ����,int �浵)
	{
		this.���� = ����;
		this.�浵 = �浵;
	}
    public String toString()
    {
    	return "������: "+����+" �浵��: "+�浵;
    }
}