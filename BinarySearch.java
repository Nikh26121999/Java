import java.util.Scanner;
class BinarySearch
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
        System.out.println("enter key to search");
        int key=scan.nextInt();
        int low=0;
        int high=arr.length-1;
        int mid;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(key==arr[mid])
            {
                System.out.println("key found at"+mid);
            }
            else if(key>arr[mid])
            {
                low=mid+1;
                high=high;
            }
            else
            {
                high=mid-1;
                low=low;
            }
        }
        System.out.println("key not found");
        System.exit(0);

    }
}