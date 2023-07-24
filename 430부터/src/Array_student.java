import java.util.*;
public class Array_student 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> profile = new ArrayList<Student>();
		
		for(int i=0;i<4;i++)
		{
			profile.add(new Student());//ArrayList에 Student형 자료 추가
		}
		Iterator<Student> it1 = profile.iterator();
		while(it1.hasNext()==true)
		{
			Student temp;
			temp = it1.next();
			System.out.println("---------------------------------");
			System.out.println("이름: " + temp.name);
			System.out.println("학과: " + temp.department);
			System.out.println("학번: " + temp.Student_num);
			System.out.println("학점평균: " + temp.score_average);
			System.out.println("---------------------------------");
		}
		
		String name="아잉";
		while(true)
		{
			System.out.print("찾을 이름을 입력하세요:");
			name = scanner.next();
			if(name.equals("그만")==true)break;
			int i;
			
			for(i=0;i<4;i++)
			{
				if(profile.get(i).name.equals(name) == true)break;
			}
			if(i==4) 
			{
				System.out.println("없는 이름입니다 다시입력하세요:");
				continue;
			}
			
			System.out.println("이름: "+profile.get(i).name+"\n학과: "+profile.get(i).department+
					"\n학번: "+profile.get(i).Student_num+"\n학점평균: "+profile.get(i).score_average+"\n");
		}
	}
}

class Student
{
	Scanner scanner=new Scanner(System.in);
	String name;
	String department;
	int Student_num;
	double score_average;
	
	Student()
	{
		System.out.print("이름:");
		this.name = scanner.next();
		
		System.out.print("학과:");
		this.department = scanner.next();
		
		System.out.print("학번:");
		this.Student_num = scanner.nextInt();
		
		System.out.print("학점평균:");
		this.score_average = scanner.nextDouble();
	}
}
