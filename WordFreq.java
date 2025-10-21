import java.util.Scanner;
public class WordFreq
{
    void word(String s,String ss)
    {	String wd="";
        char ch1;
        int l=s.length();

        int c=0;
        for(int i=0;i<l;i++)
        {
            ch1=s.charAt(i);
            if(ch1!=' ')
            {
                wd+=ch1;
            }
            else{
                if(ss.equals(wd))
                    c++;
                wd="";

            }
        }
        if(c>0)
            System.out.print("Frequency of word is "+c);
        else
            System.out.println("Word not found");


    }

    public static void main(String[] args)
    {
        WordFreq obj=new WordFreq();
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter string : ");
            String s1=sc.nextLine();
            s1=s1+" ";
            System.out.print("Enter word : ");
            String s2=sc.next();
            obj.word(s1,s2);
        }
    }
}