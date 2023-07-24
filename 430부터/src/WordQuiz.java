import java.util.Vector;
import java.util.Scanner;
public class WordQuiz 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Vector<Word> v = new Vector<Word>();
		v.add(new Word("painting","�׸�"));
		v.add(new Word("bear","��"));
		v.add(new Word("eye","��"));
		v.add(new Word("picture","����"));
		v.add(new Word("society","��ȸ"));
		v.add(new Word("human","���"));
		v.add(new Word("deal","�ŷ�"));
		
		int want;
		while(true)
		{
			System.out.print("��    �ܾ� �߰�:1    �ܾ��׽�Ʈ:2     ����:3    ��");
			want=scanner.nextInt();
			switch(want)
			{
			case 1:// �ܾ� ����
				System.out.print("����>>");
				String eng=scanner.next();
				System.out.print("�ѱ�>>");
				String kor=scanner.next();
				v.add(new Word(eng,kor));
				break;
			case 2:
				System.out.println("���� �ܾ�"+v.size()+"���� ����ֽ��ϴ�. -1�� �Է��ϸ� ����");
				int show_arr[]=new int[4];
				int count,again;// �ε������� �ߺ�Ȯ�ο�
				int choice = 0;
				int answer;
				
				/*��ġ�� �ʴ� 4���� �ε��� ����*/
				while(choice!=-1)
				{
					while(true)
					{
						again = 0;
						/*-----4���� �ε��� �����ϰ� �ο�-----*/
						for(int i=0;i<4;i++)
						{
							show_arr[i] = ((int)(Math.random()*10)) % v.size();// �ε��� ���� ����(v.size())
						}
						/*-----�ߺ��ϴ��� �˻�-----*/
						for(int i=0;i<4;i++)
						{
							for(int j=0;j<4;j++)
							{
								if(show_arr[i]== show_arr[j])again++;
							}
						}
						
						if(again<=4)break;// 4���� ��Ұ� ��ġ�� ������
					}

		
		
					answer = ((int)(Math.random()*10)) % 4;//show_arr�� �� �ε���  ---> 4���߿� �������� ���� ���Ѵ�(0~3)
					System.out.println(v.get(show_arr[answer]).get_eng()+"�� �ѱ۶���??");
					System.out.println(
							" (1)"+v.get(show_arr[0]).get_kor()+
							" (2)"+v.get(show_arr[1]).get_kor()+
							" (3)"+v.get(show_arr[2]).get_kor()+
							" (4)"+v.get(show_arr[3]).get_kor());// �����ϰ� ���� 4���� �ε���(�迭)������� �����ش�
					do
					{
						choice=scanner.nextInt();
						if(choice==-1)break;
						if(choice-1 != answer)System.out.println("Ʋ�ǽ��ϴ� �ٽ��Է��ϼ���!\n");
						else System.out.println("�����Դϴ�!\n");
					}while(choice - 1 != answer);//choice(����)��  ���ε���answer(0~3)���� +1�Ǿ��մ�.
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