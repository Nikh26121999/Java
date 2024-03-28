import java.util.Scanner;
public class PrintingindexApp 
{
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a string");
	String str=scan.nextLine();
	System.out.println("enter a character to search");
	char ch=scan.next().charAt(0);
	Printingindex pi=new Printingindex();
	int res=pi.check(str, ch);
	if(res>=0)
	{
		System.out.println("character" +ch+ "is present in the string" +str+ "at the index"+res);
		
	}
	System.out.println("not present");
}
}
