import java.util.Scanner;
public class HelloWorld
{
    public static void main(String[] args) 
    {
        System.out.println("Hello, World!\nFrom Akarsh Gangwar");
        System.out.println("Welcome to Java Programming!");
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter First num : ");
            int a=sc.nextInt();
            System.out.println("Enter Second num : ");
            int b=sc.nextInt();
            int sum=a+b;
            System.out.println("Sum is : "+sum);
        }
    }
}
