
public class book {
	private int pageno;
	public void setPageno(int a)
	{
		if(a>0)
		{
			pageno=a;
		}
		else
		{
			System.out.println("invalid pageno");
		}
	}
	public int getPageno()
	{
		return pageno;
		
	}

}
