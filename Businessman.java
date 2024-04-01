import java.util.Scanner;
public class Businessman {
	private int p;
	private int t;
	private static float r;
	private float Si;
	static
	{
		r=2.0f;
	}
	public void takeInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter principle");
		p=scan.nextInt();
		System.out.println("enter time");
		t=scan.nextInt();
	}
	public void CalculateSi()
	{
		Si=(p*t*r)/100;
	}
	public void display()
	{
		System.out.println("SI is"+Si);
	}

}
