import java.util.Scanner;
public class Grade 
{

	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("수학,과학,영어 순으로 3개의 점수 입력>>");
		int math=scanner.nextInt();
		int science=scanner.nextInt();
		int english=scanner.nextInt();
		
		Grade1 me =new Grade1(math,science,english);
		System.out.println("평균은 "+me.average);
		
		scanner.close();

	}

}

class Grade1
{
	double average;
	
	Grade1(int math,int science, int english)// 생성자는 average값을 초기화해준다.
	{
	    this.average=(double)(math+science+english)/3;
	}
}
