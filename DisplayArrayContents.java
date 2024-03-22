import java.util.Scanner;
public class DisplayArrayContents
{
public static void main(String args[])
{
    Scanner scan=new Scanner(System.in);
    System.out.println("enter length of array");
    int len=scan.nextInt();
    int arr[]=new int[len];
    for(int i=0;i<=arr.length-1;i++)
    {
        System.out.println("enter marks of student"+i);
        arr[i]=scan.nextInt();
    }
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}