
public class Point3D extends Point
{
	int z;
	Point3D(int x,int y,int z)
	{
		super(x,y);//x y좌표는 슈퍼클레스에
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
	void move(int x,int y,int z)//메소드 오버로딩
	{
		move(x,y);
		this.z=z;
	}
    public String toString()
	{
		return "("+getX()+","+getY()+","+z+")입니다.";
	}
	public static void main(String[] args) 
	{
		Point3D p=new Point3D(1,2,3);
		System.out.println(p.toString()+"입니다.");
		
		p.moveUp();//z축 이동
		System.out.println(p.toString()+"입니다.");
		
		p.moveDown();//z축 이동
		p.move(10, 10);
		System.out.println(p.toString()+"입니다");
		
		p.move(100, 200,300);
		System.out.println(p.toString()+"입니다.");

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
