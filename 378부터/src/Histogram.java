import java.util.Scanner;
public class Histogram
{
	static String readString()
	{
		StringBuffer sb=new StringBuffer();
		Scanner scanner=new Scanner(System.in);
		while(true)
		{
			System.out.print("���� �ؽ�Ʈ�� �Է��ϰ� �����ݷ��� �Է��ϼ���.");
			String line =scanner.nextLine();
			if(line.length()==1&&line.charAt(0)==';')break;
			sb.append(line);
		}
		return sb.toString();// sb������ ���۰� �մ� �װ� ��ȯ�ϵ��� toString�� �������̵� �Ѱ��ΰ�?
	}
	static void print_count(String page,char a,char A)
	{
		System.out.print(A);
		for(int i=0;i<page.length();i++)
		{
			if(page.charAt(i)==a||page.charAt(i)==A)System.out.print("-");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		String page;
		page= readString();
		char alphabet1[]= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char alphabet2[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		for(int i=0;i<20;i++)
		{
			print_count(page,alphabet1[i],alphabet2[i]);
		}

	}
}
