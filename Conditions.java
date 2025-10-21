import java.util.Scanner;
public class Conditions
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter First num : ");
            int a=sc.nextInt();
            System.out.println("Enter Second num : ");
            int b=sc.nextInt();
            // check greater number
            if(a>b)
                System.out.println(a+" is greater than "+b);
            else if(b>a)
                System.out.println(b+" is greater than "+a);
            else
                System.out.println("Both are equal");
            // check even odd
            if(a%2==0)
                System.out.println(a+" is even");
            else
                System.out.println(a+" is odd");
            if(b%2==0)
                System.out.println(b+" is even");
            else
                System.out.println(b+" is odd");
        }
    }
}