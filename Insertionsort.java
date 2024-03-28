import java.util.Scanner;
public class selectionsort 
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
		System.out.println("array elements before sorting");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+"");
		}
		System.out.println();
		selectionsortdemo sd=new selectionsortdemo();
		sd.selectionsort(arr);
		System.out.println("array elements after sorting");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+"");
		}
}
}
