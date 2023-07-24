import java.util.Scanner;
public class info 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int num;
		String name="아잉";
		
		System.out.print("몇명의 번호를 입력할것인가?");
		num=scanner.nextInt();
		PhoneBook list=new PhoneBook(num);
		
		while(name!="그만")
		{
			System.out.print("검색할 이름:");
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
	
	Phone()// 리턴타입 설정하면 안돼쥬?(void)도 안된다
	{
		System.out.print("이름을 입력하세요:");
		this.name=scanner.next();
		
		System.out.print("번호>>");
		this.tel1=scanner.nextInt();
	}
	void show()
	{
		System.out.println(tel1);
		System.out.println(name+"의 전화번호는"+tel1+"입니다.");
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
			System.out.print("확인1");
			member[i]=new Phone();// 객체 생성3시 이름과 전화번호 생성
		}
	}
	void num_search(String name)
	{	
		int i;
		for(i=0;i<num;i++)
		{
			if(member[i].name.equals(name))break;
		}
		if(i==num)System.out.print(name+"이 없습니다.");
		member[i].show();
	}
	
}