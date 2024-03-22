import java.util.Scanner;
class JaggedArray3DStudent
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter first dimension length of 3D jagged Array");
        int fd=scan.nextInt();
        int arr[][][]=new int[fd][][];
        System.out.println("enter second dimension length");
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println("enter second dimension for first dimension"+i);
            arr[i]=new int[scan.nextInt()][];
        }
        for (int i = 0; i <=arr.length-1; i++) 
        {
            for(int j=0;j<=arr.length-1;j++)
            {
                System.out.println("enter third dimension for first dimension" +i+ "and second dimension"+j);
        arr[i][j]=new int[scan.nextInt()];
    }
}
for(int i=0;i<=arr.length-1;i++)
{
    for(int j=0;j<=arr.length-1;j++)
    {
        for(int k=0;k<=arr.length-1;k++)
        {
            System.out.println("enter marks of student" +i+ "for dimensions"+j+ "and"+k);
            arr[i][j][k]=scan.nextInt();
        }
    }
}
for (int i = 0; i <= arr.length-1; i++) 
{
    for(int j=0;j<=arr.length-1;j++)
    {
        for(int k=0;k<=arr.length-1;k++)
        {
            System.out.print(arr[i][j][k]+" ");
        }
        System.out.println();
    }
}
    }
}