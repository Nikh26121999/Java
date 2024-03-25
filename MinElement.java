import java.util.Scanner;
public class MinElement
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter array length");
        int len=scan.nextInt();
        int arr[]=new int[len];
        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println("enter an element");
            arr[i]=scan.nextInt();
        }
        int min=arr[0];
        int pos=0;
        for(int i=1;i<=arr.length-1;i++)
        {
            if(arr[i]<min)
            {
                pos=i;
                min=arr[i];
            }
        }
        System.out.println("minimum element is" +min+ "present at the index" +pos);
    }
}