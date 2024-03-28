
public class Printingindex {
	int check(String s,char c)
	{
		char arr[]=s.toCharArray();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==c)
			{
				return i;
			}
		}
		return -1;
	}

}
