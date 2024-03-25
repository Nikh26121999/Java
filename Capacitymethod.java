class Capacitymethod
{
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer();
        sb.ensureCapacity(60);
        System.out.println(sb.capacity());
        sb.append("123456789123456789123456789123456789123456789123456789");
        System.out.println(sb.capacity());
        sb.append("123456789");
        System.out.println(sb.capacity());
    }
}