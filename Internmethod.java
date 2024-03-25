class Internmethod
{
    public static void main(String args[])
    {
        String s1=new String("Rama");
        System.out.println(s1);
        String s2=s1.intern();
        System.out.println(s2);
        String s3="Rama";
        System.out.println(s3);
        if(s2==s3)
        {
            System.out.println("references are equal");
        }
        else{
            System.out.println("unequal");
        }
    }
}