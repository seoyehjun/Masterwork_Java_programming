import java.util.Scanner;
public class info 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int num;
		String name="����";
		
		System.out.print("����� ��ȣ�� �Է��Ұ��ΰ�?");
		num=scanner.nextInt();
		PhoneBook list=new PhoneBook(num);
		
		while(name!="�׸�")
		{
			System.out.print("�˻��� �̸�:");
			name=scanner.next();
			list.num_search(name);
		}
	}

}
class Phone
{
	Scanner scanner =new Scanner(System.in);
	String name;
	int tel1;
	
	Phone()// ����Ÿ�� �����ϸ� �ȵ���?(void)�� �ȵȴ�
	{
		System.out.print("�̸��� �Է��ϼ���:");
		this.name=scanner.next();
		
		System.out.print("��ȣ>>");
		this.tel1=scanner.nextInt();
	}
	void show()
	{
		System.out.println(tel1);
		System.out.println(name+"�� ��ȭ��ȣ��"+tel1+"�Դϴ�.");
	}
}

class PhoneBook
{
	int num;
	Phone member[];
	PhoneBook(int num)
	{
		this.num=num;
		member=new Phone[num];
		for(int i=0;i<num;i++)
		{
			System.out.print("Ȯ��1");
			member[i]=new Phone();// ��ü ����3�� �̸��� ��ȭ��ȣ ����
		}
	}
	void num_search(String name)
	{	
		int i;
		for(i=0;i<num;i++)
		{
			if(member[i].name.equals(name))break;
		}
		if(i==num)System.out.print(name+"�� �����ϴ�.");
		member[i].show();
	}
	
}