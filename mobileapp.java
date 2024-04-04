
public class mobileapp {
	public static void main(String args[])
	{
		mobile m=new mobile();
		System.out.println(m.o.gettype());
		System.out.println(m.o.getname());
		charger c=new charger("white","1+");
		m.hasa(c);
		System.out.println(m.o.gettype());
		System.out.println(m.o.getname());
		System.out.println(m.c.getcolor());
		System.out.println(m.c.getbrand());
		
	}

}
