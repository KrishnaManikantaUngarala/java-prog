import java.util.*;
 class Congnizant1{
			HashMap<Character,Integer> m1=new HashMap<>();
			HashMap<Character,Integer> m2=new HashMap<>();
			Set<Character> ss=new HashSet<>();
			public  int find(String s,String s1)
			{
				char c[]=s.toCharArray();
				char c1[]=s1.toCharArray();
				int count=0;
				for(int i=0;i<c.length;i++)
					m1.put(c[i],m1.getOrDefault(c[i],0)+1);
				for(int i=0;i<c1.length;i++)
					m2.put(c1[i],m2.getOrDefault(c1[i],0)+1);
				for(Map.Entry<Character,Integer> ent:m1.entrySet())
				{
					if(ent.getValue()==2)
					{
						ss.add(ent.getKey());
					}		
				}
				for(Map.Entry<Character,Integer> ent1:m2.entrySet()) 
				{
					if(ent1.getValue()==3)
					{
						if(ss.contains(ent1.getKey()))
							count++;
					}
				}
				return count;	
			}
			public static void main(String arg[])
			{
				String s="aabcc";
				String s1="aaaabbccc";
				Congnizant1 cc=new Congnizant1();
				System.out.println(cc.find(s,s1));
						
			}
}
