import java.util.Scanner;
public class keysearch {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number of student object to be created");
		int len=scan.nextInt();
		Student sa[]=new Student[len];
		for(int i=0;i<=sa.length-1;i++)
		{
			sa[i]=new Student();
		}
		for(int i=0;i<=sa.length-1;i++)
		{
			System.out.println("enter student" + i + "'s Id");
			sa[i].id=scan.next();
			System.out.println("enter student" + i + "'s name");
			sa[i].name=scan.next();
			}
		System.out.println("enter Id to search");
		String key=scan.next();
		for(int i=0;i<=sa.length-1;i++)
		{
			if(key.equals(sa[i].id)) {
				System.out.println("key is present"+i);
				System.exit(0);
			}
		}
				System.out.println("key is not present");
	}

}
