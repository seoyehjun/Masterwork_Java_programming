import java.util.Scanner;

public class Bear_Fish 
{

	public static void main(String[] args) 
	{
		System.out.print("���11");
		Scanner scanner=new Scanner(System.in);
		System.out.print("���22");
		String direction;
		System.out.print("���33");
		
		Bear bear=new Bear((int)Math.random()%20,(int)Math.random()%10,1);//x�� 0~19���� y�� 0~9����
		System.out.print("���44");
		Fish fish=new Fish((int)Math.random()%20,(int)Math.random()%10,1);
		System.out.print("���55");
		Situation situation=new Situation(bear,fish);
		System.out.print("���66");
		do
		{
			System.out.print("���� ������ ������ �Է��ϼ���:");
			direction=scanner.next();
			bear.move(direction);
			fish.move(direction);
			situation.view();
			
		}while(bear.collide(fish)==false);
	}
}

abstract class GameObject
{
	protected int distance;
	protected int x,y;
	public GameObject(int startX,int startY,int distance)
	{
		this.x=startX;// ����Ŭ������ ��ġ������ ���⿡ ��±���!
		this.y=startY;
		this.distance=distance;
	}
	public int getX() {return x;}// ����Ŭ������ ��ġ���� �о��
	public int getY() {return y;}
	public boolean collide(GameObject p)
	{
		if(this.x==p.getX()&&this.y==p.getY())return true;
		else return false;
	}
	public abstract void move(String a);
}
class Bear extends GameObject
{
	 Bear(int startX,int startY,int distance)
	 {
		 super(startX,startY,distance);
	 }
	 public void move(String a)
	 {
		 if(a=="a"){ x-=1;System.out.print("����");}
		 if(a=="s"){ y+=1;}
		 if(a=="d"){ x+=1;}
		 if(a=="w"){ y-=1;}
		
	 }
}
class Fish extends GameObject
{
	static int sum;
	static int temp1;
	static int temp2;
	Fish(int startX,int startY,int distance)
	{
		super(startX,startY,distance);
		sum=0;
		temp1=(int)Math.random()%4;
		temp2=(int)Math.random()%4;
		while(temp1==temp2) {temp2=(int)Math.random()%4;}
	}
	
	public void move(String a)
	{
		if(temp1==0||temp2==0){ x-=1;}// 0��/1��/2��/3��/
		if(temp1==1||temp2==1){ y+=1;}
		if(temp1==2||temp2==2){ x+=1;}
		if(temp1==3||temp2==3){ y-=1;}
		
		sum++;
		if(sum==5)
			{
				sum=0;
				temp1=(int)Math.random()%4;
				temp2=(int)Math.random()%4;
				while(temp1==temp2) {temp2=(int)Math.random()%4;}
			}
	}
}

class Situation
{
	Fish fish;
	Bear bear;
    String location[][];
	Situation(Bear bear,Fish fish)
	{
		this.bear=bear;
		this.fish=fish;
		location=new String[10][20];
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<20;j++)
			{
				location[i][j]="-";
			}
		}
	}
	void view()
	{
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<20;j++)
			{
				location[i][j]="-";
			}
		}
		location[bear.getY()][bear.getX()]="B";// x,y���� �ٲ�� view�Ҷ����� ������
		location[fish.getY()][bear.getX()]="F";
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<20;j++)
			{
				System.out.print(location[i][j]);
			}
		}
	}
	
}