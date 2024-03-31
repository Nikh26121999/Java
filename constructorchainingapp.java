
public class constructorchainingapp 
{
	public static void main(String args[])
	{
		constructorchaining c1=new constructorchaining("nikh",674,40);
		System.out.println(c1.getName());
		System.out.println(c1.getMarks());
		System.out.println(c1.getRollno());
		constructorchaining c2=new constructorchaining();
		System.out.println(c2.getName());
		System.out.println(c2.getMarks());
		System.out.println(c2.getRollno());
	}

}
