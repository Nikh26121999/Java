
public class schoolapp {
	public static void main(String args[])
	{
		absphysicsteacher pt=new absphysicsteacher();
		abschemistryteacher ct=new abschemistryteacher();
		schoolapp ob=new schoolapp();
		ob.acceptTeacher(pt);
		ob.acceptTeacher(ct);
	}
	public void acceptTeacher(absteacher t)
	{
		t.teach();
		t.takeattendance();
	}

}
