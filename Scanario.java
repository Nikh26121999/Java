import java.util.Scanner;
public class Scenario
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("enter length of an array");
int len=scan.nextInt();
int arr[]=new int[len];
for(int i=0;i<=arr.length-1;i++)
{
System.out.println("Enter marks of student"+i);
arr[i]=scan.nextInt();
for(int i1=0;i1<=arr.length-1;i1++)
{
System.out.println(arr[i1]+"");
}
}
}
}