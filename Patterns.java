// import java.util.*;
public class Patterns {
    public static void main(String[] args) 
    {
        System.out.println();
        System.out.println("Pattern 1");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\nPattern 2");
        for(int i = 1; i<=5; i++) {
            for(int j = 5; j >= i; j--)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println("\nPattern 3 : Square");
        for(int i = 1; i<=5; i++) {
            for(int j = 1 ; j<=5 ; j++)
                System.out.print("* ");
            System.out.println();
        }

        System.out.println("\nPattern 4");
        int n = 5;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j<=n-i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println("\nPattern 5");
        for(int i = 1; i <= n;i++)
        {
            for(int j = 1; j<=n-i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print("*");
            System.out.println();
        }
        // for(int i = 1; i <= 5; i++) {
        //     for(int j = 1; j <=10; j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }
        System.out.println("\nPattern 6 (Hollow Square)");
        for(int i = 1; i<=5; i++) {
            for(int j = 1; j <= 5; j++) {
                if(i==1 || j==1 || i==5 || j==5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\nPattern 7");
        for(int i =1; i<=5; i++) {
            for(int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
        System.out.println("\nPattern 8");
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++)
                System.out.print(i + " ");
            System.out.println();
        }
        System.out.println("\nPattern 9");
        for (int i = 1; i <= 5; i++) {
            for(int j = 5; j >= i; j--)
                System.out.print(j + " ");
            System.out.println();
        }
        
         System.out.println("\nPattern 10");
        for (int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5-i+1; j++)
                System.out.print(j + " ");
            System.out.println();
        }
        System.out.println("\nPattern 11 : Floyd's Triangle");
        int num = 1;
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        System.out.println("\nPattern 12");
        for (int i = 1; i <= 5; i++) {
            for(int j = 1; j <=i; j++) {
                if ((i+j)%2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
        System.out.println();
    }
}