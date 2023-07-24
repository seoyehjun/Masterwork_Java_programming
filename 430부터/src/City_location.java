import java.util.*;
public class City_location 
{
	public static void main(String[] args) 
	{
		HashMap<String, Location> table=new HashMap<>();
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			System.out.print("도시, 위도, 경도.");
			table.put(scanner.next(),new Location(scanner.nextInt(),scanner.nextInt()));
		}
		
		
		/*저장된 도시와 위치 출력*/
		Set<String> keys = table.keySet();
		Iterator<String> it = keys.iterator();
		System.out.println("-----------------------");
		while(it.hasNext()==true)
		{
			String key= it.next();
			System.out.println(key + ": "+ table.get(key));
		}
		System.out.println("-----------------------");
		
		/*도시위치 검색*/
		String choice="앙";
		while(true)
		{
			System.out.print("도시 이름>>");
			choice = scanner.next();
			if(choice.equals("그만")==true)break;
			System.out.println(table.get(choice));
		}

	}
}

class Location
{
	int 위도,경도;
    Location(int 위도,int 경도)
	{
		this.위도 = 위도;
		this.경도 = 경도;
	}
    public String toString()
    {
    	return "위도는: "+위도+" 경도는: "+경도;
    }
}