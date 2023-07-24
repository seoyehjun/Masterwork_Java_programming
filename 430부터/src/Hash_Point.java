import java.util.*;
public class Hash_Point 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		HashMap<String,Integer> table=new HashMap<>();
		Set<String> sets=table.keySet();
		Iterator<String> it= sets.iterator();
		Iterator<String> it_print = sets.iterator();
		String name;// 키값(고객이름)
		int point;// value(고객 포인트)
		int count;//포인트 누적여부를 알기위해서
		
		while(true)
		{
			/*-----이름과 포인트 입력받는다-----*/
			System.out.print("이름입력>>");
			name = scanner.next();
			if(name.equals("그만")==true)break;// 입력종료
			System.out.print("추가할포인트>>");
			point = scanner.nextInt();
			
			/*-----고객이름 중복여부 판별(이미 잇는이름이라면 점수 누적시킨다)-----*/
			count = 0;
			while(it.hasNext()==true)
			{
				if(name.equals(it.next())==true)count++;
			}
			
			/*----- 점수 넣는부분 -----*/
			if(count>=1)//=올래잇던 고객인경우
			{
				int temp = table.get(name);
				temp+=point;//temp는 올래포인트  point는 새로얻은 포인트
				table.remove(name);// 기존 저장공간 해채
				table.put(name,temp);//기존에있던 포인트에 새로얻은 포인트를 누적해서 넣엇다.
			}
			else//=처음 포인트를 넣는 고객
			{
				table.put(name,point);//새롭게 저장공간 할당
			}
			
			/*-----키셋과 반복자 업데이트-----*/
			sets = table.keySet();
			it_print =sets.iterator();
			it = sets.iterator();
			
			/*-----출력-----*/
			while(it_print.hasNext()==true)
			{
				String temp_name=it_print.next();
				System.out.print("("+temp_name+","+table.get(temp_name)+")");
			}
			
		}

	}

}
