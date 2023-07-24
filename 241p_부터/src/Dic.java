import java.util.Scanner;
public class Dic 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		String string="¾ÆÀ×";
		String result;
		while(true)
		{
			System.out.print("»ç¶û,¾Æ±â,µ·,¹Ì·¡,Èñ¸Á:");
			string=scanner.next();
			if(string.equals("±×¸¸")) {System.out.print("ÇÁ·Î±×·¥ Á¾·á");break;}
			result=Dictionary.Kor2Eng(string);// result´Â ¿µ¾î º¯È¯°ª
			
			if(result=="fail") 
			{
				System.out.println("±×·±´Ü¾î´Â ¾ø¾î¿ä!");continue;
			}
			System.out.println("¿µ¾î·Î´Â:"+result);
			
		}
		

	}

}
class Dictionary
{
	private static String [] kor= {"»ç¶û","¾Æ±â","µ·","¹Ì·¡","Èñ¸Á"};
	private static String []eng= {"love","baby","money","future","hope"};
	public static String Kor2Eng(String word) 
	{
		for(int i=0;i<kor.length;i++)
		{
			if(word.equals(kor[i])==true) {return eng[i];}
		}
		return "fail";
	}
}
