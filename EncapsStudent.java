
public class EncapsStudent {
	private String name;
	private int rollno;
	private int marks;
	void study()
	{
		System.out.println("student is studying");
	}
	public void setData(String a,int b,int c)
	{
		name=a;
		rollno=b;
		marks=c;
	}
	public String getName()
	{
		return name;
	}
	public int getRollno()
	{
		return rollno;
	}
	public int getMarks()
	{
		return marks;
	}

}
