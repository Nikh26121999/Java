import java.util.Scanner;
public class Age {
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
			System.out.println("enter student" + i+ "'s id");
			sa[i].id=scan.next();
			System.out.println("enter student" +i+ "'s name");
			sa[i].name=scan.next();
			System.out.println("enter student"+i+"'s age");
			sa[i].age=scan.nextInt();
		}
	Student help;
		for(int i=0;i<=sa.length-2;i++)
		{
			for(int j=0;j<=sa.length-2-i;j++)
			{
				if(sa[j].age>sa[j+1].age) {
					help=sa[j];
					sa[j]=sa[j+1];
					sa[j]=help;
				}
			}
		}
		 System.out.println("Sorted array based on age:");
	        for (int i = 0; i < sa.length; i++) {
	            System.out.println("ID: " + sa[i].id + ", Name: " + sa[i].name + ", Age: " + sa[i].age);
		}
	}
}

	

