class Method
{
    int add(int x,int y)
    {
        int g=x+y;
        return g;
    }
}
    public class MethodIPANDNOOP{
        public static void main(String args[])
        {
            Method m=new Method();
            int a=10;
            int b=20;
            int res=m.add(a,b);
            System.out.println(res);
        }
    }