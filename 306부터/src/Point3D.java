
public class Point3D extends Point
{
	int z;
	Point3D(int x,int y,int z)
	{
		super(x,y);//x y��ǥ�� ����Ŭ������
		this.z=z;
	}
	void moveUp()
	{
		this.z++;
	}
	void moveDown()
	{
		this.z--;
	}
	void move(int x,int y,int z)//�޼ҵ� �����ε�
	{
		move(x,y);
		this.z=z;
	}
    public String toString()
	{
		return "("+getX()+","+getY()+","+z+")�Դϴ�.";
	}
	public static void main(String[] args) 
	{
		Point3D p=new Point3D(1,2,3);
		System.out.println(p.toString()+"�Դϴ�.");
		
		p.moveUp();//z�� �̵�
		System.out.println(p.toString()+"�Դϴ�.");
		
		p.moveDown();//z�� �̵�
		p.move(10, 10);
		System.out.println(p.toString()+"�Դϴ�");
		
		p.move(100, 200,300);
		System.out.println(p.toString()+"�Դϴ�.");

	}

}
class Point
{
	private int x,y;
	public Point(int x,int y) {this.x=x;this.y=y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x,int y) {this.x=x;this.y=y;}
}
