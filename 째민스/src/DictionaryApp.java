abstract class PairMap
{
	protected int max;
	
	abstract String get(String key);//Ű�� ���� ���� ������ش�
	abstract void put(String key,String value);//Ű�� ���� ����
	abstract String delete(String key);//value����
	abstract int length();
	protected String keyArray[];// key�� value���� �ε����� �Ȱ��� ������
	protected String valueArray[];
}

class Dictionary extends PairMap
{
	int count=0;
	
	Dictionary(int max)
	{
		this.max=max;
		keyArray=new String[max];
		valueArray=new String[max];
	}
	void put(String key,String value)
	{
		keyArray[count]=key;
		valueArray[count]=value;
		count++;
	}
	String get(String key)
	{
		for(int i=0;i<count;i++)
		{
			if(keyArray[i].equals(key)==true)return valueArray[i];
		}
		return null;
	}
	String delete(String key)//��  �ٻ������
	{
		String re="���°��Դϴ�.";
		for(int i=0;i<count;i++)
		{
			if(keyArray[i].equals(key)==true) 
			{
				re=valueArray[i];
				valueArray[i]=null;keyArray[i]=null;
			}
		}
		return re;
	}
	int length()
	{
		return count;
	}
	
}

public class DictionaryApp
{
	public static void main(String[] args) 
	{
		Dictionary dic=new Dictionary(10);// max��?
		dic.put("Ȳ����","�ڹ�");//ù��°�� key �ι�°�� value
		dic.put("���繮","���̼�");
		dic.put("���繮","c++");
		System.out.println("���繮�� ����"+dic.get("���繮"));
		System.out.println("Ȳ������ ����"+dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ����"+dic.get("Ȳ����"));

	}

}