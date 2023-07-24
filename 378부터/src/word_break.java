import java.util.*; 

public class word_break 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		String arr = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(arr," ");
		
		System.out.print("어절갯수는: "+st.countTokens());

	}
}
