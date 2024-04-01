
public class Staticdemo {
	static int a;
	static int b;
	static int c;
	static
	{
		a=100;
		b=200;
		c=300;
	}
	static void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	int x;
	int y;
	int z;
	{
x=400;
y=500;
z=600;
a=700;
b=800;
c=900;
	}
	void display2()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

