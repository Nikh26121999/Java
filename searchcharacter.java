import java.util.Scanner;
public class searchcharacter 
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String str=scan.nextLine();
		System.out.println("enter a character");
		char ch=scan.next().charAt(0);
		searchchar sc=new searchchar();
		boolean res=sc.check(str, ch);
		if(res==true)
		{
			System.out.println("entered string contain the characted");
		}
		System.out.println("not contain character");	
	}

}
