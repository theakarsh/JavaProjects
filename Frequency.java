import java.util.Scanner;
public class Frequency
{
    void char_freq()
    {
        int[] freq;
        char[] string;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter String : " );
            String str = sc.nextLine();
            freq = new int[str.length()];
            string = str.toCharArray();
            for( int i = 0; i <str.length(); i++)
            {
                freq[i] = 1;
                for( int j = i+1; j <str.length(); j++)
                {
                    if(string[i] == string[j])
                    {
                        freq[i]++;
                        string[j] = '0';
                    }
                }
            }
        }
        System.out.println("Characters and their corresponding frequencies");
        for(int i = 0; i <freq.length; i++)
        {
            if(string[i] != ' ' && string[i] != '0')
                System.out.println(string[i] + "-" + freq[i]);
        }
    }
    public static void main(String[] args)
    {
        Frequency f=new Frequency();
        f.char_freq();
    }
}
