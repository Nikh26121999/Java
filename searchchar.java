
public class searchchar {
	boolean check(String s,char c)
	{
		char arr[]=s.toCharArray();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==c)
			{
				return true;
			}
		}
		return false;
		
		}

}
