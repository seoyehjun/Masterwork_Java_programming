
public class ColorPoint1 extends Point
{
	String color;
	ColorPoint1(int x,int y)
	{
		super(x,y);// x,y��ǥ �ʱ�ȭ���ִ� ������
	    this.color="black";
	}
	ColorPoint1()
	{
		super();
		this.color="black";
	}
	void setXY(int x,int y)
	{
		move(x,y);
	}
	void setColor(String color)
	{
		this.color=color;
	}
	public String toString() //toString�� Object�� �Լ��̴�
	{
		return color+"����"+"("+getX()+","+getY()+")"+"�� ��";
	}
	public static void main(String[] args) 
	{
		ColorPoint1 zeroPoint=new ColorPoint1();
		System.out.println(zeroPoint.toString()+"�Դϴ�.");
		
		ColorPoint1 cp=new ColorPoint1(10,10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString()+"�Դϴ�.");
	}
}
class Point
{
	private int x,y;
	public Point(int x,int y) {this.x=x;this.y=y;}// ������
	public Point() {this.x=0;this.y=0;}// ������
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x,int y) {this.x=x;this.y=y;}
}