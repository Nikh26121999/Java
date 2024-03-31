
public class Fan {
	int noofblades;
	String brand;
	String color;
	public Fan()
	{
		super();
	}
	public Fan(int noofblades,String brand)
	{
		super();
		this.noofblades=noofblades;
		this.brand=brand;
	}
	public Fan(String brand,String color)
	{
		this(3,"bajaj",color);
		this.brand=brand;
		this.color=color;
	}
	public Fan(int noofblades,String brand,String color)
	{
		super();
		this.noofblades=noofblades;
		this.brand=brand;
		this.color=color;
	}
	

}
