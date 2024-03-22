
import java.util.Scanner;

class CopyArray{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int len=scan.nextInt();
        int arr1[]=new int[len];
        System.out.println("enter array contents");
        for(int i=0;i<=arr1.length-1;i++)
        {
            System.out.println("enter an element");
            arr1[i]=scan.nextInt();
        }
        int[] arr2=new int[arr1.length];
        for(int i=0;i<=arr2.length-1;i++)
        {
            arr2[i]=arr1[i];
        }
        System.out.println("Contents of arr2 (copied from arr1):");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
