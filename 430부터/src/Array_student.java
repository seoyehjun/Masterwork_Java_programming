import java.util.*;
public class Array_student 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> profile = new ArrayList<Student>();
		
		for(int i=0;i<4;i++)
		{
			profile.add(new Student());//ArrayList�� Student�� �ڷ� �߰�
		}
		Iterator<Student> it1 = profile.iterator();
		while(it1.hasNext()==true)
		{
			Student temp;
			temp = it1.next();
			System.out.println("---------------------------------");
			System.out.println("�̸�: " + temp.name);
			System.out.println("�а�: " + temp.department);
			System.out.println("�й�: " + temp.Student_num);
			System.out.println("�������: " + temp.score_average);
			System.out.println("---------------------------------");
		}
		
		String name="����";
		while(true)
		{
			System.out.print("ã�� �̸��� �Է��ϼ���:");
			name = scanner.next();
			if(name.equals("�׸�")==true)break;
			int i;
			
			for(i=0;i<4;i++)
			{
				if(profile.get(i).name.equals(name) == true)break;
			}
			if(i==4) 
			{
				System.out.println("���� �̸��Դϴ� �ٽ��Է��ϼ���:");
				continue;
			}
			
			System.out.println("�̸�: "+profile.get(i).name+"\n�а�: "+profile.get(i).department+
					"\n�й�: "+profile.get(i).Student_num+"\n�������: "+profile.get(i).score_average+"\n");
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
		System.out.print("�̸�:");
		this.name = scanner.next();
		
		System.out.print("�а�:");
		this.department = scanner.next();
		
		System.out.print("�й�:");
		this.Student_num = scanner.nextInt();
		
		System.out.print("�������:");
		this.score_average = scanner.nextDouble();
	}
}
