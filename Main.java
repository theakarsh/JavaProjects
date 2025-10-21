import java.util.Scanner;
class Main
{
    void count()
    {
        int vowel_count=0,digit_count=0,uc=0,lc=0,space=0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter String : ");
            String str=sc.nextLine();
            
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(Character.isUpperCase(ch))
                    uc++;
                if(Character.isLowerCase(ch))
                    lc++;
                if(Character.isDigit(ch))
                    digit_count++;
                if(ch==' ')
                    space++;
                if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
                    vowel_count++;
            }
            System.out.println("Lower Case Chars : " + lc );
            System.out.println("Upper Case Chars : " + uc );
            System.out.println("Digits Present : " + digit_count);
            System.out.println("Vowels Present : " + vowel_count);
        }
        System.out.println("No of Space : " + space);
    }
    public static void main(String[] args)
    {
        Main c=new Main();
        c.count();
    }
}