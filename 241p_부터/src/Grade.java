import java.util.Scanner;
public class Grade 
{

	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("����,����,���� ������ 3���� ���� �Է�>>");
		int math=scanner.nextInt();
		int science=scanner.nextInt();
		int english=scanner.nextInt();
		
		Grade1 me =new Grade1(math,science,english);
		System.out.println("����� "+me.average);
		
		scanner.close();

	}

}

class Grade1
{
	double average;
	
	Grade1(int math,int science, int english)// �����ڴ� average���� �ʱ�ȭ���ش�.
	{
	    this.average=(double)(math+science+english)/3;
	}
}
