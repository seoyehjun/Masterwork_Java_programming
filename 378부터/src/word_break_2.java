import java.util.Scanner;
public class word_break_2 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		String arr[] = text.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			if(arr[i].equals("  ")==true)System.out.print("널");
		}
		
		System.out.print("어절 갯수는: "+arr.length);

	}
}
