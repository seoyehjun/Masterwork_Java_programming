
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
		if(x>=0&&y>=0)super.move(x,y);//�������̵��Ȱ� �����ʰ� superŬ������ ��������??
	}
	public String toString()
	{
		return "("+getX()+","+getY()+")�� ��";
	}
	public static void main(String[] args) 
	{
		PositivePoint p=new PositivePoint();
		p.move(10,10);
		System.out.println(p.toString()+"�Դϴ�.");
		
		p.move(-5,5);
		System.out.println(p.toString()+"�Դϴ�.");
		
		PositivePoint p2=new PositivePoint(-10,-10);
		System.out.println(p2.toString()+"�Դϴ�.");		
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