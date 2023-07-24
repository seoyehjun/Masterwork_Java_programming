import java.util.*;
public class Array_test 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> a= new ArrayList<String>();
		
		for(int i=0;i<5;i++)
		{
			System.out.print(i+1 + "번째 학점(A,B,C,D,F");
			a.add(scanner.next());
		}
		
		Iterator<String> it = a.iterator();
		int temp;
		double sum=0,average;
		
		//---------등급을 점수(숫자)로바꾸는 과정
		while(it.hasNext()==true)
		{
			String grade = it.next();
			switch(grade)//---(A->4.0/ B->3.0/ C->2.0/ D->1.0/ F->0.0)
			{
				case "A":
					sum+=4.0;
					break;
				case "B":
					sum+=3.0;
					break;
				case "C":
					sum+=2.0;
					break;
				case "D":
					sum+=1.0;
					break;
				case "F":
					sum+=0.0;
					break;
			}
				
		}
		
		System.out.print(average=sum/5);
	}

}
