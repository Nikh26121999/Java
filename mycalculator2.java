
import java.util.Scanner;

class mycalculator2 implements Calculator
{
    void mul()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a*b;
        System.out.println(c);
    }
    void div()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a/b;
        System.out.println(c);
    }
}