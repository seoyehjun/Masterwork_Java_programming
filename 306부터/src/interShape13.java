interface Shape
{
	final double PI=3.14;// ����� �����Ҽ� �մ�.
	void draw();// public abstract
	double getArea();//public abstract
	default public void redraw()
	{
		System.out.print("---�ٽ� �׸��ϴ�.");
		draw();
	}
}


public class interShape13 
{

	public static void main(String[] args) 
	{
		Shape donut =new Circle(10);//�������� 10�� �� ��ü
		donut.redraw();
		System.out.println("������"+donut.getArea());
	}
}
class Circle implements Shape
{
	int radius;
	Circle(int radius)
	{
		this.radius=radius;
	}
	public double getArea()
	{
		return radius*radius*PI;
	}
	public void draw()
	{
		
	}
	
}
