import java.util.Scanner;
public class Dic 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		String string="����";
		String result;
		while(true)
		{
			System.out.print("���,�Ʊ�,��,�̷�,���:");
			string=scanner.next();
			if(string.equals("�׸�")) {System.out.print("���α׷� ����");break;}
			result=Dictionary.Kor2Eng(string);// result�� ���� ��ȯ��
			
			if(result=="fail") 
			{
				System.out.println("�׷��ܾ�� �����!");continue;
			}
			System.out.println("����δ�:"+result);
			
		}
		

	}

}
class Dictionary
{
	private static String [] kor= {"���","�Ʊ�","��","�̷�","���"};
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
