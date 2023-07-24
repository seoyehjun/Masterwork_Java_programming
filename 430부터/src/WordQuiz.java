import java.util.Vector;
import java.util.Scanner;
public class WordQuiz 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Vector<Word> v = new Vector<Word>();
		v.add(new Word("painting","그림"));
		v.add(new Word("bear","곰"));
		v.add(new Word("eye","눈"));
		v.add(new Word("picture","사진"));
		v.add(new Word("society","사회"));
		v.add(new Word("human","사람"));
		v.add(new Word("deal","거래"));
		
		int want;
		while(true)
		{
			System.out.print("§    단어 추가:1    단어테스트:2     종료:3    §");
			want=scanner.nextInt();
			switch(want)
			{
			case 1:// 단어 삽입
				System.out.print("영어>>");
				String eng=scanner.next();
				System.out.print("한글>>");
				String kor=scanner.next();
				v.add(new Word(eng,kor));
				break;
			case 2:
				System.out.println("현재 단어"+v.size()+"개가 들어있습니다. -1을 입력하면 종료");
				int show_arr[]=new int[4];
				int count,again;// 인덱스간의 중복확인용
				int choice = 0;
				int answer;
				
				/*겹치지 않는 4개의 인덱스 생성*/
				while(choice!=-1)
				{
					while(true)
					{
						again = 0;
						/*-----4개의 인덱스 랜덤하게 부여-----*/
						for(int i=0;i<4;i++)
						{
							show_arr[i] = ((int)(Math.random()*10)) % v.size();// 인덱스 범위 재한(v.size())
						}
						/*-----중복하는지 검사-----*/
						for(int i=0;i<4;i++)
						{
							for(int j=0;j<4;j++)
							{
								if(show_arr[i]== show_arr[j])again++;
							}
						}
						
						if(again<=4)break;// 4개의 요소가 겹치지 않을때
					}

		
		
					answer = ((int)(Math.random()*10)) % 4;//show_arr에 쓸 인덱스  ---> 4개중에 랜덤으로 답을 정한다(0~3)
					System.out.println(v.get(show_arr[answer]).get_eng()+"의 한글뜻은??");
					System.out.println(
							" (1)"+v.get(show_arr[0]).get_kor()+
							" (2)"+v.get(show_arr[1]).get_kor()+
							" (3)"+v.get(show_arr[2]).get_kor()+
							" (4)"+v.get(show_arr[3]).get_kor());// 랜덤하게 만든 4개의 인덱스(배열)순서대로 보여준다
					do
					{
						choice=scanner.nextInt();
						if(choice==-1)break;
						if(choice-1 != answer)System.out.println("틀렷습니다 다시입력하세요!\n");
						else System.out.println("정답입니다!\n");
					}while(choice - 1 != answer);//choice(보기)는  답인덱스answer(0~3)보다 +1되어잇다.
				}
				break;
				
			}
		}
		
		
	}
}

class Word
{
	String eng;
	String kor;
	Word(String eng,String kor)
	{
		this.eng = eng;
		this.kor = kor;
	}
	boolean check(String kor)
	{
		if(this.kor==kor)return true;
		else return false;
	}
	String get_kor()
	{
		return this.kor;
	}
	String get_eng()
	{
		return this.eng;
	}

}