import java.util.Scanner;

public class Circle_dot 
{

	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		int center_x,center_y;
		int mydot_x,mydot_y;
		double r;
		
		System.out.print("원의 중심을 입력하세요(x값): ");
		center_x=scanner.nextInt();
		System.out.print("원의 중심을 입력하세요(y값): ");
		center_y=scanner.nextInt();
		System.out.print("반지름을 입력하세요: ");
		r=scanner.nextDouble();
		
		System.out.print("판별하고 싶은 점을 입력하세요(x값): ");
	    mydot_x=scanner.nextInt();
	    System.out.print("판별하고 싶은 점을 입력하세요(y값): ");
	    mydot_y=scanner.nextInt();
	    
	    double ax=(center_x>mydot_x)? center_x-mydot_x : mydot_x-center_x;// ax는 센터의x값과 판별점의 x값의 차이
	    System.out.println("(mydot_y*mydot_y): "+mydot_y*mydot_y+"r*r: "+(r*r)+"ax*ax: "+(ax*ax)+"center_y :"+center_y);
	    if((mydot_y*mydot_y)<(r*r)-(ax*ax)+center_y)System.out.println("점("+mydot_x+","+mydot_y+")는 원 안에 있다.");
	    else System.out.println("안에 없다");
	}

}
