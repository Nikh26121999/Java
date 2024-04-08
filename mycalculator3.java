
import java.util.Scanner;

class mycalculator3 implements Calculator
{
    void mul()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a=scan.nextInt();
        int b=scan.nextInt();
        if(a==0 || b==0)
        {
            System.out.println("dont need calculator");
        }
        else
        {
            int c=a*b;
            System.out.println(c);
        }
        void div()
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("enter 2 numbers");
            int a=scan.nextInt();
            int b=scan.nextInt();
            if(b==0)
            {
                int c=a/b;
                System.out.println(c);
            }
        }
    }
}