import java.util.Scanner;
public class Array_2D {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
             int rows = sc.nextInt();
             int cols = sc.nextInt();
             int[][] numbers = new int[rows][cols];
             System.out.println("Enter Matrix : ");
             // outer loop - rows || inner loop - columns
            for (int i = 0; i < rows; i++) {
                 for (int j = 0; j < cols; j++)
                    numbers[i][j] = sc.nextInt();
            }
            System.out.println("Entered elements are : ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++)
                    System.out.print(numbers[i][j] + " ");
                System.out.println();
            }
            // search for a given number and find its location
            System.out.println("Enter no to be searched : ");
            int x = sc.nextInt();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if(numbers[i][j] == x)
                        System.out.println("Num found at " + i + "," + j);
                }
            }
        }
    }
}