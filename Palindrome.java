import java.util.Scanner;
public class Palindrome 
{
    void palindrome_String() 
    {
        String str1, str2 = "";
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the string you want to check:");
            str1 = sc.nextLine();
        }
        int l = str1.length();
        for (int i = l - 1; i >= 0; i--) {
            str2 = str2 + str1.charAt(i);
        }
        if (str1.equalsIgnoreCase(str2))
            System.out.println("The string is palindrome.");
        else
            System.out.println("The string is not palindrome.");
    }
    public static void main(String[] args)
    {
        Palindrome ps = new Palindrome();
        ps.palindrome_String();
    }
}