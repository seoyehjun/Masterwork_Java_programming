import java.util.Scanner;
public class lastword 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("����̼� �÷���  �Ұ��ΰ�?: ");
		n=scanner.nextInt();
		Player []player=new Player[n];
	    Player c[]=new Player[n];// �÷��̾� ��üx ���۷���o ����
	    
	    for(int i=0;i<n;i++)
	    {
	    	player[i]=new Player();// ���۷����� ��ü �Ҵ�
	    	System.out.print(i+"��°�̸��� �Է��϶�: ");
	    	player[i].name=scanner.next();
	    }
	    int i=0;
	    char last='��';
	    while(true)
	    {
	        i++;
	    	i%=3;
	    	System.out.print(player[i].name+">>");
	    	player[i].getWordFromUser();
	        char first=player[i].firstChar;
	       
	        if(last!=first)
	        {
	        	System.out.print(player[i].name+"�� �����ϴ�!");
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
		this.word=scanner.next();// ������Ƽ
		LastIndex=this.word.length()-1;
		lastChar=this.word.charAt(LastIndex);//������ ���� 
		firstChar=this.word.charAt(0);//ù����
	}
	
}



