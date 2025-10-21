import java.util.*;
class Calculator
{
    void calculator()
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter 1st No : " );
            int a=sc.nextInt();
            System.out.println("Select Arithmetic Operation: +,-,*,/,%");
            System.out.print("Your Choice : ");
            char op=sc.next().charAt(0);
            System.out.print("Enter 2nd No : " );
            int b=sc.nextInt();
            int res = switch(op) 
            {
                case '+' -> a + b;
                case '-' -> a - b;
                case '*' -> a * b;
                case '/' -> {
                    if (b != 0) yield a / b;
                    else {
                        System.out.println("Cannot divide by zero");
                        yield 0;
                    }
                }
                case '%' -> {
                    if (b == 0) {
                        System.out.println("Cannot divide by zero");
                        yield 0;
                    }
                    else yield a % b;
                }
                default -> {
                    System.out.println("Error 404!");
                    yield 0;
                }
            };
            System.out.println("Result : " + res );}
        catch (Exception e )
        {
            System.out.println( "Enter digits only");
        }
    }
    public static void main(String[] args)
    {
        Calculator cc=new Calculator();
        cc.calculator();
    }
}
