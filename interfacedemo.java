class interfacedemo
{
    public static void main(String args[])
    {
        mycalculator mc=new mycalculator();
        mycalculator2 mc2=new mycalculator2();
        mycalculator3 mc3=new mycalculator3();
        math m=new math();
        m.permit(mc);
        m.permit(mc2);
        m.permit(mc3);
    }
}