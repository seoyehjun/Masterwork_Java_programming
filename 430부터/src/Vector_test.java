import java.util.*;
public class Vector_test 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v=new Vector<>();
		
		int choice = 0;
		
		while(true)
		{
			System.out.print("정수(종료는-1)>>>");
			choice = scanner.nextInt();
			if(choice == -1)break;
			v.add(choice);
		}
		Iterator<Integer> it = v.iterator();
		//----------여기서부터 재일 큰값 스캔
		int most_big = it.next();
		while(it.hasNext()==true)
		{
			int temp = it.next();
			if(most_big<temp)most_big = temp;
		}
		System.out.print("가장 큰수는 : "+most_big);
		
	}
}
