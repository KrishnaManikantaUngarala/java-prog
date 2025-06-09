import java.util.*;
class Swap
{
    int a,b;
    Swap(int x,int y)
    {
        a=x;
        b=y;
    }
    void swap()
    {
        a=a^b;
        b=a^b;
        a=a^b;
    }
}
class Main
{       
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number:");
            Integer a = sc.nextInt();
            System.out.println("Enter the second number:");
            Integer b = sc.nextInt();
            System.out.println("Before swapping:");
            System.out.println("a = "+a);
            System.out.println("b = "+b);
            Swap ss=new Swap(a,b);
            ss.swap();
            System.out.println("After swapping:");
            System.out.println("a = "+ss.a);
            System.out.println("b = "+ss.b);
        }
}