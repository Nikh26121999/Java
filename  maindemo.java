
public class maindemo {
void main()
{
	System.out.println("hello");
}
int main(int x)
{
	return x+1;
}
public static void main(int args[])
{
	System.out.println(args[0]);
	System.out.println(args[1]);
}
public static void main(String args[])
{
	System.out.println("this is important");
	maindemo d=new maindemo();
	d.main();
	System.out.println(d.main(10));
	int a[]= {10,20};
	maindemo.main(a);
	
}

}
