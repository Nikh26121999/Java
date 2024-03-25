class demo
{
    public static void main(String args[])
    {
        String s1=new String("Nikita");
        String s2=new String("Nikita");
        if(s1==s2)
        {
            System.out.println("references are equal");
        }
        else{
            System.out.println("references are unequal");
        }
        if(s1.equals(s2))
        {
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are unequal");
        }
    }
}