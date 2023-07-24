import java.util.*;
enum Choice{set,add,sub,jn0,print}


public class get_my_order 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		Vector<Order> v = new Vector<>();
		Iterator<Order> it = v.iterator();
		
		System.out.print("Supercomputer has been operated plz convey your order");
		while(true)
		{
			System.out.print(">>");
			String order = scanner.next();
			int var = scanner.nextInt();
			int value = scanner.nextInt();
		}
		

	}
}
class Order
{
	int var;
	int value;
	
}
class Set extends Order
{
    Set(int value)
    {
    	this.var = value;
    }
}
class Move extends Order
{
	Move(int value)
	{
		this.var += value;
	}
}
class Sub extends Order
{
	Sub(int value)
	{
		var -= value;
	}
}
class Jn0 extends Order
{
	
}
class print extends Order
{
	
}
