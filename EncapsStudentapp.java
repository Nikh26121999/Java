
public class EncapsStudentapp {
	public static void main(String args[])
	{
		EncapsStudent es=new EncapsStudent();
		//es.name="raju";
		//es.rollno="42";
		es.setData("raju",42,100);
		System.out.println(es.getName());
		System.out.println(es.getRollno());
		System.out.println(es.getMarks());
		
	}

}
