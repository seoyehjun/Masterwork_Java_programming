import java.util.*;
import java.io.*;


public class hangman 
{	 
	private String newword;
	private StringBuffer hiddenword;
	private final int HIDDENCOUNT = 2;
	void run()
	{
		Scanner scanner= new Scanner(System.in);
		File file = new File("C:\\Users\\�츮��\\Desktop\\�ڵ�\\JAVA����\\��ǰJAVA���α׷���(����4��)_�н��ڿ�[20190220]\\words.txt");
		Word words = new Word(file);
		newword = words.get_randomword();
		makehidden();
		String choice="y";
		System.out.println("��   ���ݺ��� ��ǰ����� �����մϴ�.   ��");
		do
		{
			go();
			System.out.print("Next(y/n)?");
			choice = scanner.next();
			newword = words.get_randomword();
			makehidden();
		}while(choice.equals("y")==true);
	}
	void makehidden()//newword������ 2���� ������hiddenword�� ����
	{
		hiddenword = new StringBuffer(newword);
		Random r = new Random();
		/*-----�ߺ������ʴ�2���� �ε��� ����------*/
		int index1,index2;
		index1 = r.nextInt(hiddenword.length());
		index2 = r.nextInt(hiddenword.length());
		while(index1 == index2)
		{
			index2 = r.nextInt(hiddenword.length());
		}
		/*---------------------------*/
			
		hiddenword.setCharAt(index1, '-');
		hiddenword.setCharAt(index2, '-');
	}
	
	void go()
	{
		Scanner scanner = new Scanner(System.in);
		int fail_count = 0;
		while(true)
		{
			System.out.println(hiddenword);
			System.out.print("��ĭ���� �ܾ��� �ϳ�>>");
			String user1 = scanner.next();
			char user2 = user1.charAt(0);
			
			int i,correct=0;
			
			for(i=0;i<hiddenword.length();i++)//�����Է°� �񱳸����� �ѱ��ھ� �Ǵ´�.
			{
				if(hiddenword.charAt(i)=='-' && newword.charAt(i)==user2)
				{
					hiddenword.setCharAt(i,user2);//������ �Է°� �������κ��� �ܾ ��ġ�ϴ��� �˻�
					correct++;//correct�� 0�̸�(�´´ܾ �ϳ���������) fail_count���ö󰣴� 
				}
			}
			
			if(correct==0) fail_count++;//  '-'�� ������ �ܾ�� �Է´ܾ ��ġ���� ������.
			
			if(fail_count>=5||complate()==true)break;//5�� �����ϰų� �ܾ �ٸ��߸� ����
		}
		System.out.println("\nnewword:"+newword);//���� ���
	}
	
	boolean complate()
	{
		int count=0;
		for(int i=0;i<newword.length();i++)
		{
			if(hiddenword.charAt(i)!=newword.charAt(i))count++;
		}
		if(count==0)return true;//�ܾ �ϼ��Ѱ��
		else return false;//���� '-'�� �����ִ°��
	}
	
	public static void main(String[] args) 
	{
		hangman app =new hangman();
		app.run();

	}
	
	
}

class Word
{
	Vector<String> table = new Vector<String>();
	Word(File file)
	{
		try
		{
			Scanner scanner = new Scanner(new FileReader(file));
			while(scanner.hasNext()) 
			{
				String word = scanner.nextLine();
				table.add(word);
			}
		}
		catch(IOException e)
		{
			System.out.print("������ �дµ� �����߽��ϴ�.");
		}
	}
	
	String get_randomword()
	{
		Random r = new Random();
		
		int random_index = r.nextInt(table.size());//�ܾ� ���� ������ ������ ���� ����
		return table.get(random_index);// ������ �ε����� �־ �ܾ� ��ȯ
	}
	
	
}