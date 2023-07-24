abstract class PairMap
{
	protected int max;
	
	abstract String get(String key);//키를 보고 값을 출력해준다
	abstract void put(String key,String value);//키와 값을 저장
	abstract String delete(String key);//value삭제
	abstract int length();
	protected String keyArray[];// key와 value쌍은 인덱스를 똑같이 해주자
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
	String delete(String key)//값  ☆삭★제☆
	{
		String re="없는값입니다.";
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
		Dictionary dic=new Dictionary(10);// max값?
		dic.put("황기태","자바");//첫번째가 key 두번째가 value
		dic.put("이재문","파이선");
		dic.put("이재문","c++");
		System.out.println("이재문의 값은"+dic.get("이재문"));
		System.out.println("황기태의 값은"+dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은"+dic.get("황기태"));

	}

}