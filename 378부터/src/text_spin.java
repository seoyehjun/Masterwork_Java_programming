import java.util.*;
public class text_spin 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ϴ� ���ڿ�: ");
		
		String text = scanner.nextLine();
		String sub;
		String result;
		String first;
		int length = text.length();
		
		for(int i = 0 ; i < length ; i++)
		{
			first = text.charAt(0) + "";
			sub = text.substring(1);// ù���ڸ� �����ϰ� ���ڿ� ����
			result = sub.concat(first);// ������ ���ڿ��ڿ� ù��°���� ���δ�
			System.out.println(result);
			text = result;
		}
		

	}

}
