
public class Arraymagic 
{
	public static void main(String[] args) 
	{
		Arrayutil array_util;
		int [] array1= {1,5,7,9};
		int [] array2= {3,6,-1,100,77};
		int [] array3=  Arrayutil.contact(array1,array2);

		Arrayutil.print();
	}

}
class Arrayutil
{
	public static int result[];
	public static int [] contact(int[] a,int[] b)
	{
		result=new int[a.length + b.length];
		int i;
		for(i=0;i<a.length;i++)
		{
			result[i]=a[i];
		}
		for(int j=0;j<b.length;j++)
		{
			result[i]=b[j];
			i++;
		}
		return result;
	}
	public static void  print() 
	{
		for(int i=0;i<result.length;i++)
		{
			System.out.print(" "+result[i]);
		}
	}
}
