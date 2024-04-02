
public class Animal {
	String name;
	int age;
	public Animal()
	{
	
	}
	public Animal(int age)
	{
		this();
		this.age=age;
	}
	public Animal(String name)
	{
		this(25);
		this.name=name;
	}
	public Animal(String name,int age)
	{
		this("nikh");
		this.name=name;
		this.age=age;
	}

}
