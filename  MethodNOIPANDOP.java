class Method
{
    int add()
    {
        int a=10;
        int b=20;
        int c=a+b;
        return c;
    }
}
class  MethodNOIPANDOP
{
    public static void main(String[] args) 
    {
        Method m=new Method();
        int res=m.add();
        System.out.println(res);
    }
}