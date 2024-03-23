import java.util.Scanner;
class BubbleSort
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the array length");
        int len=scan.nextInt();
        int arr[]=new int[len];
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println("enter an element");
            arr[i]=scan.nextInt();
        }
        System.out.println("array elements before sorting");
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println(arr[i]+"");
        }
        System.out.println();
    int help;
    for(int i=0;i<=arr.length-2;i++)
    {
        for(int j=0;j<=arr.length-2-i;j++)
        {
            if(arr[j]>arr[j+1])
            {
                help=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=help;
            }
        }
    }
    System.out.println("Array elements after sorting");
    for(int i=0;i<=arr.length-1;i++)
    {
        System.out.println(arr[i]+"");
    }
}
}