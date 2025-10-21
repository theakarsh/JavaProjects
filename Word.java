import java.util.Scanner;
class Word
{
    String str, word="";
    int l;
    char ch;
    void input()
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print( "Enter String : ");
            str=sc.nextLine();
        }
        str+= " ";
    }
    void display()
    {
        //int count=0;
        l=str.length();
        for(int i=0; i<l; i++)
        {
            ch=str.charAt(i);
            if(ch!=' ')
                word += ch;
            else
            {
                System.out.println(word + "      " );
                word="";
            }
        }
    }

    public static void main(String[] args)
    {
        Word w=new Word();
        w.input();
        w.display();
    }
}
