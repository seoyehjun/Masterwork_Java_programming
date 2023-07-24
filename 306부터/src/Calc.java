import java.util.Scanner;
public class Calc 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		Add add=new Add();
		Sub sub=new Sub();
		Mul mul=new Mul();
		Div div=new Div();
		int a,b,result=1;
		String operator;
		System.out.print("정수1>>>");
		a=scanner.nextInt();
		System.out.print("정수2>>>");
		b=scanner.nextInt();
		System.out.print("연산자>>>");
		operator=scanner.next();
		
		switch(operator)
		{
		case "+":
			add.setValue(a,b);
			result=add.calculate();
			break;
		case "-":
			sub.setValue(a, b);
			result=sub.calculate();
			break;
		case "*":
			mul.setValue(a, b);
			result=mul.calculate();
		    break;
		case "/":
			div.setValue(a, b);
			result=div.calculate();
			break;
		}
		System.out.print("결과는>>"+result);	
	}
}
abstract class Calc_util
{
	int a,b;
	abstract void setValue(int a,int b);
	abstract int calculate();
}

class Add extends Calc_util
{
	void setValue(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	int calculate()
	{
		return a+b;
	}
}
class Sub extends Calc_util
{
	void setValue(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	int calculate()
	{
		if(a>=b)return a-b;
		else return b-a;
	}
}
class Mul extends Calc_util
{
	void setValue(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	int calculate()
	{
		return a*b;
	}
}
class Div extends Calc_util
{
	void setValue(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	int calculate()
	{
		if(a>=b)return a/b;
		else return b/a;
	}
}
