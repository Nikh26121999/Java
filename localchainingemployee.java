
public class localchainingemployee {
	String ssn;
	int age;
	int salary;
	String name;
	public localchainingemployee()
	{
	}
	public localchainingemployee(int age,int salary)
	{
		this();
		this.salary=salary;
	}
	public localchainingemployee(int age,int salary,String name)
	{
		this(25,50000);
		this.age=age;
	}
	public localchainingemployee(int salary,String name)
	{
		super();
		this.name=name;
	}
	public localchainingemployee(String ssn,String name)
	{
		this(20000,"rohan");
		this.ssn=ssn;
	}
	public localchainingemployee(String ssn,int age)
	{
		this("m1811674","nikita");
	}
	public localchainingemployee(String ssn,int age,int salary,String name)
	{
		this(25,20000,"kodnest");
		this.name=name;
	}
	{
		
	}

}
