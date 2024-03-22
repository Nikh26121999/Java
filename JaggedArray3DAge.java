import java.util.Scanner;
class JaggedArray3DAge
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter rows");
        int rows=scan.nextInt();
        int arr[][]=new int[rows][];
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println("Enter column length and row"+i);
            arr[i]=new int[scan.nextInt()];
        }
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=0;j<=arr.length-1;j++)
            {
                System.out.println("enter Age");
                arr[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=0;j<=arr.length-1;j++)
            {
                System.out.print(arr[i][j]+"");
            }
            System.out.println();
        }
        }
}