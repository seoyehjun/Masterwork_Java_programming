import java.util.Scanner;
public class lastword 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("몇명이서 플레이  할것인가?: ");
		n=scanner.nextInt();
		Player []player=new Player[n];
	    Player c[]=new Player[n];// 플레이어 객체x 레퍼런스o 생성
	    
	    for(int i=0;i<n;i++)
	    {
	    	player[i]=new Player();// 레퍼런스에 객체 할당
	    	System.out.print(i+"번째이름을 입력하라: ");
	    	player[i].name=scanner.next();
	    }
	    int i=0;
	    char last='지';
	    while(true)
	    {
	        i++;
	    	i%=3;
	    	System.out.print(player[i].name+">>");
	    	player[i].getWordFromUser();
	        char first=player[i].firstChar;
	       
	        if(last!=first)
	        {
	        	System.out.print(player[i].name+"이 졌습니다!");
	        	break;
	        }
	        last=player[i].lastChar;
	    }

	}

}

class Player
{
	Scanner scanner=new Scanner(System.in);
	String name;
	String word;
	int LastIndex;
	char lastChar;
	char firstChar;

	void getWordFromUser()
	{
		this.word=scanner.next();// 프로퍼티
		LastIndex=this.word.length()-1;
		lastChar=this.word.charAt(LastIndex);//마지막 문자 
		firstChar=this.word.charAt(0);//첫문자
	}
	
}



