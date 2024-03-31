
public class constructorchaining {
	private String name;
	private int rollno;
	private int marks;
	public constructorchaining()
	{
		super();
	}
public constructorchaining(String name,int rollno,int marks)
{
	super();
	this.name=name;
	this.rollno=rollno;
	this.marks=marks;	
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
