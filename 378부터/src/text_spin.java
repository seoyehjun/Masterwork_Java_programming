import java.util.*;
public class text_spin 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("원하는 문자열: ");
		
		String text = scanner.nextLine();
		String sub;
		String result;
		String first;
		int length = text.length();
		
		for(int i = 0 ; i < length ; i++)
		{
			first = text.charAt(0) + "";
			sub = text.substring(1);// 첫문자를 제외하고 문자열 추출
			result = sub.concat(first);// 추출한 문자열뒤에 첫번째문자 붙인다
			System.out.println(result);
			text = result;
		}
		

	}

}
