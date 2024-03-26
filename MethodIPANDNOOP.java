class Method
{
    void add(int x,int y)
    {
        int c=x+y;
        System.out.println(c);
    }
}
    class MethodIPANDNOOP
    {
        public static void main(String[] args)
        {
            Method m=new Method();
            int a=10;
            int b=20;
            m.add(a+b);
        }
    }