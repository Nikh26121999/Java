public class substringdemo
{
    String stringSubstring(String str,int beginIndex)
    {
        char ch1[]=str.toCharArray();
        char ch2[]=new char[ch1.length-beginIndex];
        int j=0;
        for(int i=beginIndex;i<=ch1.length-1;i++)
        {
            ch2[j]=ch1[i];
            j++;
        }
        String res=new String(ch2);
        return res;
    }
    String stringSubstring(String str,int beginIndex,int endIndex)
    {
        char ch1[]=str.toCharArray();
        char ch2[]=new char[(endIndex-beginIndex)+1];
        int j=0;
        for(int i=beginIndex;i<=endIndex;i++)
        {
            ch2[j]=ch1[i];
            j++;
        }
        String res=new String(ch2);
        return res;

    }
}