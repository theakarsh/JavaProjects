import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            // method 1
            System.out.print("Enter String : ");
            String s = sc.nextLine();
            StringBuilder str = new StringBuilder(s);
            System.out.print("Reversed String : ");
            for (int i = str.length()-1; i >= 0; i--)
                System.out.print(str.charAt(i));
                
            System.out.println();
            
            // method 2 --> 0 to n/2
            for (int i = 0; i < str.length()/2; i++) {
                int front = i;
                int back = str.length()-1-i;
                char frontchar = str.charAt(front);
                char backchar = str.charAt(back);
                str.setCharAt(front, backchar);
                str.setCharAt(back, frontchar);
            }
            System.out.println("Reversed : " + str);
        }
    }
}