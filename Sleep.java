import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Sleep {
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String []args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter String : ");
            String input = sc.nextLine();
            try
            {
                for(int i=0;i<input.length();i++)
                {
                    for(int j=0;j<=i;j++)
                        System.out.print(input.charAt(j) + " ");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println();
                }
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            try
            {
                for(int i=input.length()-2;i>=0;i--)
                {
                    for(int j=0;j<=i;j++)
                        System.out.print(input.charAt(j) + " ");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println();
                }
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}