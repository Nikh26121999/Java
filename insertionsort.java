
public class insertionsort {
	void insertionsortdemo(int a[])
	{
		int item;
		int i,j;
		
		for(i=1;i<=a.length-1;i++)
		{
			item=a[i];
			j=i-1;
			while(j>=0 && a[j]>item)
			{
				a[j+1]=a[j];
				--j;
			}
			a[j+1]=item;
		}
	}

}
