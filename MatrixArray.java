import java.util.Scanner;
class MatrixArray
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int rows=scan.nextInt();
        int cols=scan.nextInt();
        int arr[][]=new int[rows][cols];
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=0;j<=arr.length-1;j++)
            {
                System.out.println("enter the age");
                arr[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=0;j<=arr.length-1;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        }
}