import java.util.*;
public class HashMap_test 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		HashMap<String,Integer> nations = new HashMap<String,Integer>();
		
		String nation = "��";
		
		while(true)
		{
			System.out.print("�����̸��� �Է��ϼ���: ");
			nation = scanner.next();
			if(nation.equals("�׸�")==true)break;
			System.out.print("������ �α��� �Է��ϼ���(����: ��): ");
			nations.put(nation, scanner.nextInt());
		}
		System.out.println("\n\n");
		while(true)
		{
			System.out.print("�α��˻�(�����̸�): ");
			nation = scanner.next();
			if(nation.equals("�׸�")==true)break;
			
			Integer value = nations.get(nation);
			if(value==null)System.out.println("�׷������ �����ϴ�");//----Integer��  null�� �������ִ�.
			else System.out.println("�α���: "+value);
			System.out.println();
		}

	}
}
