import java.util.*;
class FirstNegative 
{
    public static List<Integer> firstNegative(int arr[], int n,int k)
    {
        List<Integer> l1=new ArrayList<>();
        Deque<Integer> d=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(!d.isEmpty() && d.peekFirst()==i-k)
                d.pollFirst();
            if(arr[i]<0)
                d.offer(i);
            if(i>=k-1)
            {
                if(!d.isEmpty())
                    l1.add(arr[d.peekFirst()]);
                else
                    l1.add(0);
            }
        }
        return l1;
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value:");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter k value:");
        int k = sc.nextInt();
        List<Integer> l11=firstNegative(arr,n,k);
        System.out.println("First Negative Number is :"+l11);
    }
}