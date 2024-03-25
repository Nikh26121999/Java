import java.util.Scanner;
public class SwapElement
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter array length");
        int len=scan.nextInt();
        int arr[]=new int[len];
        System.out.println("enter array elements");
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println("enter an element");
            arr[i]=scan.nextInt();
        }
        System.out.println("array contents before sorting");
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println(arr[i]+"");
        }
        System.out.println();
        System.out.println("enter 2 indexes to swap");
        int i1=scan.nextInt();
        int i2=scan.nextInt();
        int help;
        help=arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=help;
        System.out.println("Array contents after swapping");
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println(arr[i]+"");
        }

    }
}