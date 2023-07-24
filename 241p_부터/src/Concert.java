import java.util.Scanner;
public class Concert 
{
	
	public static void main(String[] args) 
	{
		s_seat type1=new s_seat();// 이 안에있는 함수가 쓰고싶다이거야
		a_seat type2=new a_seat();
		b_seat type3=new b_seat();
		seat_condition condition=new seat_condition();
		Scanner scanner=new Scanner(System.in);
		
		
		int choice;
		int i=0;
	    User []user=new User[300];
	    
		do
	    {
	    	System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4");
	    	choice=scanner.nextInt();
	    	
	        switch(choice)
	    	{
	        case 1:
	        	System.out.print("이름을 입력하세요:");
	    		String name=scanner.next();
	    		System.out.print("좌석타입을 입력하세요:");
	    		String type=scanner.next();
	    		System.out.print("좌석번호를 입력하세요:");
	    		int seat_num=scanner.nextInt();
	    		if(type.equals("s")==true)
	    		{
	    			type1.add_s(seat_num,name);
	    		}
	    		else if(type.equals("a")==true)
	    		{
	    			type2.add_a(seat_num,name);
	    		}
	    		else if(type.equals("b")==true)
	    		{
	    			type3.add_b(seat_num, name);
	    		}
	    		
	    		user[i]=new User(name,type,seat_num);// 예약시 User 객체 하나씩 생성
	    		i++;
	    	break;
	    	
	        case 2:
	        	condition.view();
	        	break;
	        	
	        case 3:
	        	System.out.print("삭제할 이름은?:");
	        	String temp=scanner.next();
	        	int j;
	        	for(j=0;j<100;j++)
	        	{
	        		if(user[j].name.equals(temp)==true)break;
	        	}
	        	if(j==100)System.out.print("없는 이름입니다.");
	        	if("s".equals(user[j].type)==true)
	    		{
	    			type1.remove_s(user[j].seat_num);
	    		}
	    		else if("a".equals(user[j].type)==true)
	    		{
	    			type2.remove_a(user[j].seat_num);
	    		}
	    		else if("b".equals(user[j].type)==true)
	    		{
	    			type3.remove_b(user[j].seat_num);
	    		}
	        	break;
	        	
	    	}
	    }while(choice!=4);

	}

}
class User
{
	String name;
	String type;
	int seat_num;
	User(String name,String type,int seat_num)
	{
		this.name=name;
		this.type=type;
		this.seat_num=seat_num;
	}
	
}

class seat_condition
{
	static String s[];
	static String a[];
	static String b[];
	
	seat_condition()
	{
		s = new String[10];
		a = new String[10];
		b = new String[10];
		int i;
		for(i=0;i<10;i++)
		{
			s[i]="---";
			a[i]="---";
			b[i]="---";
		}
	}
	/*---view all seat---*/
	static void view()
	{
	   for(int i=0;i<10;i++)
	   {
		   System.out.print(" "+ s[i]);
	   }System.out.print("\n");
	   for(int i=0;i<10;i++)
	   {
		   System.out.print(" "+ a[i]);
	   }System.out.print("\n");
	   for(int i=0;i<10;i++)
	   {
		   System.out.print(" "+ b[i]);
	   }System.out.print("\n");
	}
}

/*---자리 배열은 List클레스에 있다---*/
class s_seat
{
	
	/*-----s seat(i는 좌석번호 <index>)-----*/
	void add_s(int i,String name)// 
	{
		if(seat_condition.s[i].equals("---")==false)System.out.print("이미 사람이 있습니다.");
		else {seat_condition.s[i]=name;}
	}
	/*----i는 좌석번호<index>----*/
	void remove_s(int i)
	{
		seat_condition.s[i]="---";
	}
}

class a_seat
{
	/*-----a seat(i는 좌석번호 <index>)-----*/
	void add_a(int i,String name)
	{
		if(seat_condition.a[i].equals("---")==false)System.out.print("이미 사람이 있습니다.");
		else {seat_condition.a[i]=name;}
	}
	/*----i는 좌석번호<index>----*/
	void remove_a(int i)
	{
		seat_condition.a[i]="---";
	}
}

class b_seat
{
	/*-----b seat(i는 좌석번호 <index>)-----*/
	void add_b(int i,String name)
	{
		if(seat_condition.b[i].equals("---")==false)System.out.print("이미 사람이 있습니다.");
		else {seat_condition.b[i]=name;}
	}
	/*----i는 좌석번호<index>----*/
	void remove_b(int i)
	{
		seat_condition.b[i]="---";
	}
}

