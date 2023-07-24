import java.util.Scanner;
public class GraphicEditor 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		Shape start=new Shape(),last=new Shape(),obj;//obj는 임시 레퍼
		Shape []shape=new Shape[40];
		for(int i=0;i<40;i++)
		{
			shape[i]=new Shape();
		}
		int choice=0;
		int choice_type;
		int count=0;
		while(choice!=4)
		{
			System.out.print("삽입(1), 삭제(2), 모두보기(3), 종료(4)");
			choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
				if(count==0)
				{
					System.out.print("Line(1), Rect(2), Circle(3)>>>");
					choice_type=scanner.nextInt();
				    if(choice_type==1) {start=new Line();last=start;last.next=null;}
				    else if(choice_type==2) {start=new Rect();last=start;last.next=null;}
				    else if(choice_type==3) {start=new Circle();last=start;last.next=null;}
				    count++;
				    break;
				}
				
				System.out.print("Line(1), Rect(2), Circle(3)>>>");
				choice_type=scanner.nextInt();
			    if(choice_type==1) {obj=new Line();last.next=obj;last=obj;last.next=null;}
			    else if(choice_type==2) {obj=new Rect();last.next=obj;last=obj;last.next=null;}
			    else if(choice_type==3) {obj=new Circle();last.next=obj;last=obj;last.next=null;}
				break;
			case 2:
				System.out.print("삭제할 도형의 위치:");
				int loc=scanner.nextInt();
				obj=start;
				if(loc==1)start=obj.next;//첫째도형 삭제할경우
				for(int i=1;i<loc-1;i++)
				{
					obj=obj.next;
				}
				obj.next=obj.next.next;
				break;
			case 3:
				
				obj=start;
				do
				{
					obj.draw();
					obj=obj.next;
				}
				while(obj!=null);
				break;
			}
		}

	}

}
class Shape
{
	public Shape next;
	public Shape() {next=null;}
	
	public void draw()
	{
		System.out.println("Shape");
	}
}

class Line extends Shape
{
	public void draw()
	{
		System.out.println("Line");
	}
}
class Rect extends Shape
{
	public void draw()
	{
		System.out.println("Rect");
	}
}
class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Circle");
	}
}