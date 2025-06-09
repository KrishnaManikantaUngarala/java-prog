import java.util.*;
class Prime
{
    public boolean check(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
class Main2
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Prime p = new Prime();
        if(p.check(n))
        {
            System.out.println("given no"+n+"is prime");
        }
        else
        {
            System.out.println("given no"+n+"is not a prime");
        }
    }
}