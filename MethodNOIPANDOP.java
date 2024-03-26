class Method
{
    void add()
    {
        int a;
        int b;
        int c;
        a=10;
        b=20;
        c=a+b;
        System.out.println(c);
    }

    void add(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void add(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
class MethodNOIPANDOP
{
    public static void main(String[] args) {
        Method m=new Method();
        m.add();
    }
}