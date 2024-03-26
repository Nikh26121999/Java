import java.util.Scanner;
public class StudentArrayApp {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number of students");
		int len=scan.nextInt();
		Student sa[]=new Student[len];
		for(int i=0;i<=sa.length-1;i++)
		{
			sa[i]=new Student();		
		}
		for(int i=0;i<=sa.length-1;i++)
		{
			System.out.println("enter students"+i+"'s ID");
			sa[i].id=scan.next();
			System.out.println("enter students"+i+"'s name");
			sa[i].name=scan.next();
		}
		System.out.println("array contents are");
		for(int i=0;i<=sa.length-1;i++)
		{
			System.out.println(sa[i].id+ " " +sa[i].name + " | ");
		}
		}

}
