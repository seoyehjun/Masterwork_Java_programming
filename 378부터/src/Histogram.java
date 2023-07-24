import java.util.Scanner;
public class Histogram
{
	static String readString()
	{
		StringBuffer sb=new StringBuffer();
		Scanner scanner=new Scanner(System.in);
		while(true)
		{
			System.out.print("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
			String line =scanner.nextLine();
			if(line.length()==1&&line.charAt(0)==';')break;
			sb.append(line);
		}
		return sb.toString();// sb내에는 버퍼가 잇다 그걸 반환하도록 toString을 오버라이드 한것인가?
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
