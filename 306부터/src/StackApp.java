import java.util.Scanner;
interface Stack
{
	int length();//public abstract�� ������ �߻�޼����̴�.
	int capacity();//public abstract�� ������ �߻�޼����̴�.
	String pop();//�̰͵� �߻�
	boolean push(String val);//public abstract �� ������ �߻�޼����̴�.
	
}
class StringStack implements Stack
{
	private int max;
	int count=0;
	private String arr[];
	public int length()
	{
		return count;
	}
	public int capacity()
	{
		return max;
	}
	public boolean push(String val)
	{
		if(count<max) 
		{
			arr[count++]=val;//�ε����� �ְ�count�� ������Ű�� �װ� ����� ������ �ȴ�.
			return true;
		}
		else return false;
		
	}
	public String pop()
	{
		return arr[--count];
	}
	StringStack(int a)
	{
		max=a;
		arr=new String[a];//���ڿ� ������� Ȯ��
	}
	
}
public class StackApp
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int max;
		String string="�ʱ�ȭ";
		boolean bool;
		
		System.out.print("������ �ִ� ��������� �����ϼ���: ");
		max=scanner.nextInt();
		StringStack stack=new StringStack(max);
		
		while(true)
		{
			System.out.print("���ڿ� �Է�>>>");
			string=scanner.next();
			if(string.equals("�׸�")==true)break;
			bool=stack.push(string);
			if(bool==false)System.out.print("������ ������ Ǫ�� �Ұ�");
			
		}
		for(;stack.count!=0;)
		{
			System.out.print(stack.pop());
		}

	}
}
