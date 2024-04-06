import java.util.Scanner;
class Circle extends Shape
{
    float rad;
    public void takeInput()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter radius of circle");
        rad=scan.nextfloat();
    }
    public void ComputeA()
    {
        area=3.142f*rad*rad;
    }
}