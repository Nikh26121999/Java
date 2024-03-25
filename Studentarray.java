public class Studentarray
{
    String id;
    String name;
    int age,marks; 
}
public class Studentarray
{
public static void main(String[] args) 
{
    Student s1=new Student();
    s1.id="KOD001";
    s1.name="Raju";
    s1.age=22;
    s1.marks=35;
    Student s2=new Student();
    s1.id="KOD002";
    s1.name="Rohan";
    s1.age=33;
    s1.marks=45;
    Student s3=new Student();
    s1.id="KOD003";
    s1.name="Rajesh";
    s1.age=24;
    s1.marks=45;
    Student sa[]=new Student[3];
    sa[0]=s1;
    sa[1]=s2;
    sa[2]=s3;
    for (int i = 0; i <=sa.length-1; i++)
     {
        System.err.println(sa[i].id+"" + sa[i].name+"" +sa[i].age+"" +sa[i].marks);
     }  
    
}
}