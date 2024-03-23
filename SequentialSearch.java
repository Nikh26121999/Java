import java.util.Scanner;
class demo
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter size of array");
        int len=scan.nextInt();
        int arr[]=new int[len];
        System.out.println("enter array elements");
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println("enter an element");
            arr[i]=scan.nextInt();
        }
        System.out.println("enter key to search");
        int key=scan.nextInt();
        for(int i=0;i<=arr.length-1;i++)
        {
            if(key==arr[i])
            {
                System.out.println("key found at index"+i);
            }
            System.exit(0);
        }
        System.out.println("key not found");
    }
}