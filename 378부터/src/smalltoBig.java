import java.lang.*;
import java.util.*;
public class smalltoBig 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���");
		String text = scanner.nextLine();
		String arr[] = text.split(" ");// �ɰ� ���ڿ��� ������
		String order = "��";
		String origin=null, replace=null;
		int count=0;
		
		while(order.equals("�׸�")==false)
		{
			origin=null;
			replace=null;
			StringTokenizer st;
			do
			{
				System.out.print("���>>");
				order = scanner.nextLine();
				st=new StringTokenizer(order,"!");//!���������� ������ ��ü�� ���� �������� ��ü��ų����
				if(st.countTokens()!=2)System.out.println("�߸��� ����̿�\n");
			}while(st.countTokens()!=2);// �������(<origin>!<replace>)-->2���� �ɰ����� ������ �ٽ��Է�
			
			origin = st.nextToken();
			replace = st.nextToken();
			
			//-----------�� ���� for���� �����鼭 origin�̶� ������ �� ���ٸ� ��ü(arr[]�̶�)
			count=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i].equals(origin)==true) 
				{
					arr[i]=replace;count++;
				}	
			}
			//------------��ü �Ϸ�
		    
			//------------���
			for(int i=0;i<arr.length;i++)
		    {
		    	System.out.print(arr[i]);
		    	System.out.print(" ");
		    }
		    System.out.println("\n");
			if(count==0)System.out.println("�׷����� �����ϴ�.\n");//�ϳ��� ��ã�����
		}
		

	}

}
