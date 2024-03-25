import java.util.StringTokenizer;
class Stringtokenizer
{
    public static void main(String args[])
    {
        StringTokenizer st=new StringTokenizer("kodnest technologies pvt limited");
        while(st.hasMoreTokens()==true)        {
            System.out.println(st.nextToken());
        }
    }
}