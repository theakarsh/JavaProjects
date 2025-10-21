import java.util.*;
public class SearchInArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array : ");
            int size = sc.nextInt();
            int[] num = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + i + " : ");
                num[i] = sc.nextInt();
            }
            System.out.print("Enter number to be searched : ");
            int n = sc.nextInt();
            for (int i = 0; i < num.length; i++) {
                if(num[i] == n) // Linear Search
                    System.out.println("Number found at : " + i);
            }            
        }
    }
}
