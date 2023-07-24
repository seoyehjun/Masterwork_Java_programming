import java.util.Scanner;
interface Stack
{
	int length();//public abstract이 생략된 추상메서드이다.
	int capacity();//public abstract이 생략된 추상메서드이다.
	String pop();//이것도 추상
	boolean push(String val);//public abstract 이 생략된 추상메서드이다.
	
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
			arr[count++]=val;//인덱스에 넣고count를 증가시키면 그게 요소의 갯수가 된다.
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
		arr=new String[a];//문자열 저장공간 확보
	}
	
}
public class StackApp
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int max;
		String string="초기화";
		boolean bool;
		
		System.out.print("스택의 최대 저장공간을 설정하세요: ");
		max=scanner.nextInt();
		StringStack stack=new StringStack(max);
		
		while(true)
		{
			System.out.print("문자열 입력>>>");
			string=scanner.next();
			if(string.equals("그만")==true)break;
			bool=stack.push(string);
			if(bool==false)System.out.print("스택이 꽉차서 푸시 불가");
			
		}
		for(;stack.count!=0;)
		{
			System.out.print(stack.pop());
		}

	}
}
