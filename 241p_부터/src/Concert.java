import java.util.Scanner;
public class Concert 
{
	
	public static void main(String[] args) 
	{
		s_seat type1=new s_seat();// �� �ȿ��ִ� �Լ��� ����ʹ��̰ž�
		a_seat type2=new a_seat();
		b_seat type3=new b_seat();
		seat_condition condition=new seat_condition();
		Scanner scanner=new Scanner(System.in);
		
		
		int choice;
		int i=0;
	    User []user=new User[300];
	    
		do
	    {
	    	System.out.print("����:1, ��ȸ:2, ���:3, ������:4");
	    	choice=scanner.nextInt();
	    	
	        switch(choice)
	    	{
	        case 1:
	        	System.out.print("�̸��� �Է��ϼ���:");
	    		String name=scanner.next();
	    		System.out.print("�¼�Ÿ���� �Է��ϼ���:");
	    		String type=scanner.next();
	    		System.out.print("�¼���ȣ�� �Է��ϼ���:");
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
	    		
	    		user[i]=new User(name,type,seat_num);// ����� User ��ü �ϳ��� ����
	    		i++;
	    	break;
	    	
	        case 2:
	        	condition.view();
	        	break;
	        	
	        case 3:
	        	System.out.print("������ �̸���?:");
	        	String temp=scanner.next();
	        	int j;
	        	for(j=0;j<100;j++)
	        	{
	        		if(user[j].name.equals(temp)==true)break;
	        	}
	        	if(j==100)System.out.print("���� �̸��Դϴ�.");
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

/*---�ڸ� �迭�� ListŬ������ �ִ�---*/
class s_seat
{
	
	/*-----s seat(i�� �¼���ȣ <index>)-----*/
	void add_s(int i,String name)// 
	{
		if(seat_condition.s[i].equals("---")==false)System.out.print("�̹� ����� �ֽ��ϴ�.");
		else {seat_condition.s[i]=name;}
	}
	/*----i�� �¼���ȣ<index>----*/
	void remove_s(int i)
	{
		seat_condition.s[i]="---";
	}
}

class a_seat
{
	/*-----a seat(i�� �¼���ȣ <index>)-----*/
	void add_a(int i,String name)
	{
		if(seat_condition.a[i].equals("---")==false)System.out.print("�̹� ����� �ֽ��ϴ�.");
		else {seat_condition.a[i]=name;}
	}
	/*----i�� �¼���ȣ<index>----*/
	void remove_a(int i)
	{
		seat_condition.a[i]="---";
	}
}

class b_seat
{
	/*-----b seat(i�� �¼���ȣ <index>)-----*/
	void add_b(int i,String name)
	{
		if(seat_condition.b[i].equals("---")==false)System.out.print("�̹� ����� �ֽ��ϴ�.");
		else {seat_condition.b[i]=name;}
	}
	/*----i�� �¼���ȣ<index>----*/
	void remove_b(int i)
	{
		seat_condition.b[i]="---";
	}
}

