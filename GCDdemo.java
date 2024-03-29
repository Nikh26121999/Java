import java.util.Scanner;
public class RecurrenceGCD {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 2 numbers to find GCD");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		GCDdemo d=new GCDdemo();
		int res=d.gcd(num1, num2);
		System.out.println("GCD of entered 2 numbers"+num1+" "+num2+ "is"+res);
		
	}

}
