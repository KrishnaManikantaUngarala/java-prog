import java.util.*;
class Num
{
	public static int findZero(int a[])
	{
		int n=0;
		int sum=0;
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]==1)
			{
				sum+=n;
			}
			else
			{
				n++;
			}
		}
		return sum;
	}
	public static void main(String arg[])
	{
		int ar[]={1,0,1,0,0,1};
		System.out.println(findZero(ar));
	}
}
	 
			

			