import java.util.*;
public class Loops {
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            // for loop
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
            }
            System.out.println("+++++++++");
            // while loop
            int i = 1;
            while(i<=5) {
                System.out.print(i + "\t");
                i++;
            }
            System.out.println();
            // do while => executes one time in all conditions 
            int j = 20;
            do{
                System.out.println(j);
            }while(j<5);

            // print sum of first 10 natural numbers
            System.out.print("Enter n : ");
            int n = sc.nextInt();
            int sum = 0;
            for(int k = 1; k <= n; k++){
                sum += k;
                System.out.print(k + "\t");
            }
            System.out.println();
            System.out.println("Sum of first 10 natural num : " +sum);

            // print the table of a num given by user
            System.out.print("Enter the num of which table you want : ");
            int num = sc.nextInt();
            for(int t = 1; t <= 10; t++)
            {
                System.out.println(t * num);
            }

            
            
        }
        System.out.println();
    }
}