import java.util.Scanner;
public class BubbleSortAndSearch
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
        int temp;
        for(int i=0;i<=arr.length-2;i++)
        {
            for(int j=0;j<=arr.length-2-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println(arr[i]+"");
        }
        System.out.println();
        System.out.println("enter key to search");
        int key=scan.nextInt();
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(low <= high)
        {
            mid=(low + high) / 2;
        if(key == arr[mid])
        {
            System.out.println("key found at index"+mid);
            return;
        }
        else if(key > arr[mid])
        {
            low=mid+1;
            high=high;
        }else
        {
            low=low;
            high=mid-1;
        }
        }
    System.out.println("key not found");
    }
}

