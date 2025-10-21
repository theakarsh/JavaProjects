import java.util.*;
public class Functions {
    public static int calcProd(int a, int b) {
        return a * b;
    }
    public static void factorial(int n) {
        if(n<0)
            System.out.println("Invalid choice!");
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *= i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a : ");
            int a = sc.nextInt();
            System.out.print("Enter b : ");
            int b = sc.nextInt();
            System.out.println("Product of " + a + " and " + b + " is : " + calcProd(a, b));
            System.out.print("Enter num to get factorial : ");
            int fact = sc.nextInt();
            System.out.print("Factorial of " + fact + " is : ");
            factorial(fact);
        }
    }
}
