
public class PositivePoint extends Point
{
	PositivePoint(int x,int y)
	{
		super(x,y);
	}
	PositivePoint()
	{
		super();
	}
	protected void move(int x,int y)
	{
		if(x>=0&&y>=0)super.move(x,y);//오버라이딩된걸 쓰지않고 super클레스의 것을쓴다??
	}
	public String toString()
	{
		return "("+getX()+","+getY()+")의 점";
	}
	public static void main(String[] args) 
	{
		PositivePoint p=new PositivePoint();
		p.move(10,10);
		System.out.println(p.toString()+"입니다.");
		
		p.move(-5,5);
		System.out.println(p.toString()+"입니다.");
		
		PositivePoint p2=new PositivePoint(-10,-10);
		System.out.println(p2.toString()+"입니다.");		
	}
}
class Point
{
	private int x,y;
	public Point(int x,int y) {if(x>=0&&y>=0) {this.x=x;this.y=y;}}
	public Point() {this.x=0;this.y=0;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x,int y) {this.x=x;this.y=y;}
}