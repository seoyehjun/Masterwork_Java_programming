
public class Circle_384 
{
	
	public static void main(String[] args) 
	{
		Circle a=new Circle(2,3,5);
		Circle b=new Circle(2,3,30);
		System.out.println("�� a : "+a);
		System.out.println("�� b : "+b);
		if(a.equals(b))System.out.println("���� ��");
		else System.out.println("���� �ٸ� ��");
	}

}

class Circle
{
	int x,y,radius;
	
	Circle(int x,int y,int radius)
	{
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	boolean equals(Circle c)
	{
		if(this.x==c.x&&this.y==c.y)return true;
		else return false;
	}
	public String toString()// Object�޼ҵ� �������̵�
	{
		return "Circle("+x+","+y+")������"+radius;
	}
}
