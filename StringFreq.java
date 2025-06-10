import java.util.*;
public class StringFreq {
	    HashMap<Character,Integer> hp=new HashMap<>();
	public void find(String s)
	{
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			/*if(hp.containsKey(c[i]))       
			{
				hp.put(c[i],hp.get(c[i])+1);
			}
			else
			{
				hp.put(c[i],1);
			}*/
			hp.put(c[i],hp.getOrDefault(c[i],0)+1);
		}
		for(Map.Entry<Character,Integer> map:hp.entrySet())
		{
			System.out.println("KEY: "+map.getKey()+"value: "+map.getValue());
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		StringFreq f=new StringFreq();
		f.find(s);
		// TODO Auto-generated method stub

	}

}
