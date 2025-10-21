import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 53;
        marks[1] = 63;
        marks[2] = 64;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println("----------");
        for (int i = 0; i <= 2; i++) // single loop to extract whole array data
            System.out.println("Marks " + i + " : " + marks[i]);
        System.out.println("_---_");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array : ");
            int size = sc.nextInt();
            int[] num = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i+1) + " : ");
                num[i] = sc.nextInt();
            }
            for (int i = 0; i < size; i++)
                System.out.println("Element at index " + i + " : " + num[i]);
        }
    }
}
