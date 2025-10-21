import java.util.Scanner;
import java.util.StringTokenizer;
public class StringToken
{
    static int count(String wrd)
    {
        int c=0;
        int l=wrd.length();
        for(int i=0;i<l;i++)
        {
            char ch=wrd.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                c++;
        }
        return c;
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("ENTER THE SENTENCE:");
            String ipStr = sc.nextLine();
            ipStr=ipStr.toUpperCase();

            StringTokenizer st = new StringTokenizer(ipStr);
            while (st.hasMoreTokens())
            {
                String word = st.nextToken();
                System.out.println(word+" "+count(word));

            }
        }
    }
}
