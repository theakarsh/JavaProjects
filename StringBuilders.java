import java.util.*;
public class StringBuilders {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            StringBuilder sb = new StringBuilder(input);
            System.out.println(sb);
            System.out.println(sb.charAt(2));
            // sb.setCharAt(0,'o');
            System.out.println(sb);
            System.out.println(sb.insert(1, 'a'));
            System.out.println(sb.delete(1, 5));
            System.out.println(sb.append('k'));
        }
    }
}