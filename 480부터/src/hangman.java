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
		File file = new File("C:\\Users\\우리집\\Desktop\\코딩\\JAVA한잔\\명품JAVA프로그래밍(개정4판)_학습자용[20190220]\\words.txt");
		Word words = new Word(file);
		newword = words.get_randomword();
		makehidden();
		String choice="y";
		System.out.println("§   지금부터 행맨게임을 시작합니다.   §");
		do
		{
			go();
			System.out.print("Next(y/n)?");
			choice = scanner.next();
			newword = words.get_randomword();
			makehidden();
		}while(choice.equals("y")==true);
	}
	void makehidden()//newword글자중 2개를 가려서hiddenword에 저장
	{
		hiddenword = new StringBuffer(newword);
		Random r = new Random();
		/*-----중복되지않는2개의 인덱스 생성------*/
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
			System.out.print("빈칸에들어갈 단어중 하나>>");
			String user1 = scanner.next();
			char user2 = user1.charAt(0);
			
			int i,correct=0;
			
			for(i=0;i<hiddenword.length();i++)//유저입력과 비교를위해 한글자씩 훌는다.
			{
				if(hiddenword.charAt(i)=='-' && newword.charAt(i)==user2)
				{
					hiddenword.setCharAt(i,user2);//유저의 입력과 가려진부분의 단어가 일치하는지 검사
					correct++;//correct가 0이면(맞는단어가 하나도없으면) fail_count가올라간다 
				}
			}
			
			if(correct==0) fail_count++;//  '-'로 가려진 단어와 입력단어가 일치하지 않으면.
			
			if(fail_count>=5||complate()==true)break;//5번 실패하거나 단어를 다맞추면 나감
		}
		System.out.println("\nnewword:"+newword);//정답 출력
	}
	
	boolean complate()
	{
		int count=0;
		for(int i=0;i<newword.length();i++)
		{
			if(hiddenword.charAt(i)!=newword.charAt(i))count++;
		}
		if(count==0)return true;//단어를 완성한경우
		else return false;//아직 '-'가 남아있는경우
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
			System.out.print("파일을 읽는데 실패했습니다.");
		}
	}
	
	String get_randomword()
	{
		Random r = new Random();
		
		int random_index = r.nextInt(table.size());//단어 갯수 내에서 랜덤한 숫자 생성
		return table.get(random_index);// 랜덤한 인덱스를 넣어서 단어 반환
	}
	
	
}