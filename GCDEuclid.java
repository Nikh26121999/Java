import java.util.Scanner;
class GCDEuclid
{
    int findGCD(int m,int n)
    {
        int rem;
        while(n!=0)
        {
            rem=m%n;
            m=n;
            n=rem;
        }
        int gcd=m;
        return gcd;

    }
}
class GCDEuclid
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number and find gcd");
        int a=scan.nextInt();
        int b=scan.nextInt();
        GCDEuclid ge=new GCDEuclid;
        int res=ge.findGCD(a,b);
        System.out.println("the gcd of" +a+ "and" +b+ "is" +res);
    }    

    private int findGCD(int a, int b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}