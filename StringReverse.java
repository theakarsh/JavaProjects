import java.util.*;
class StringReverse
{
    String str;
    void input()
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter String : ");
            str=sc.nextLine();
        }
    }
    void design1()
    {
        for(int i =0;i<str.length();i++)
        {
            for(int j=0;j<=i;j++)
                System.out.print(str.charAt( j )+" ");
            System.out.println();
        }
    }
    void design2()
    {
        for(int i = str.length()-1 ;i>=0;  i--)
        {
            for(int j=0 ;  j<=i ; j++ )
                System.out.print(str.charAt( j ) +" ");
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        StringReverse sp=new StringReverse();
        sp.input();
        sp.design1();
        System.out.println("~~~~~~~~~~" );
        sp.design2();
    }
}
