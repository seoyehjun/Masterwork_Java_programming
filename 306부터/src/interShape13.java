interface Shape
{
	final double PI=3.14;// 상수를 포함할수 잇다.
	void draw();// public abstract
	double getArea();//public abstract
	default public void redraw()
	{
		System.out.print("---다시 그립니다.");
		draw();
	}
}


public class interShape13 
{

	public static void main(String[] args) 
	{
		Shape donut =new Circle(10);//반지름이 10인 원 객체
		donut.redraw();
		System.out.println("면적은"+donut.getArea());
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
