
interface IStack<T>
{
	T Pop();
	boolean Push(T ob);
}
public class Generic_Stack 
{
	public static void main(String[] args) 
	{

		IStack<Integer> stack= new MyStack<Integer>();
		for(int i=0;i<10;i++)stack.Push(i);
		while(true)
		{
			Integer n = stack.Pop();
			if(n==null)break;
			System.out.print(n+" ");
		}
		

	}
}
class MyStack<T>implements IStack<T>
{
	Object stack[];
	int point=0;
	
	public MyStack()
	{
		stack=new Object[20];
	}
	
	public boolean Push(T v)
	{
		if(point>=20)return false;
		else 
		{
			stack[point++] = v;
			return true;
		}
	}
	
	public T Pop()
	{
		if(point<=0)return null;
		else
		{
			return (T)stack[--point];
		}
	}
}
