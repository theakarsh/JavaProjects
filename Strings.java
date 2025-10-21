import java.util.*;
public class Strings {
    public static void main(String[] args) {
        String name = "Akarsh";
        String fullName = "Akarsh Gangwar";
        System.out.println(name + "\n" + fullName);
        if(name.compareTo(fullName)==0)
            System.out.println("Strings are Equal.");
        else
            System.out.println("Strings are Unequal.");
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter String : ");
            String input = sc.nextLine();
            System.out.println("Length of " + input + " is : " + input.length());
            for (int i = 0; i < input.length(); i++) {
                for (int j = 0; j <= i; j++)
                    System.out.print("  ");
                System.out.println(input.charAt(i));
            }
        }
    }
}
