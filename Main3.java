import java.util.*;
class Fib
{
    public void fib(int n)
    {
        int a=0;
        int b=1;
        for(int i=0;i<n;i++)
        {
            int c=a+b;
            System.out.print(a+" ");
            a=b;
            b=c;
        }
    }
}
class Main3
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Fib ob=new Fib();
        ob.fib(n);
    }
}