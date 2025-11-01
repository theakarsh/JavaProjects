public class AdvancedPatterns {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Butterfly Pattern");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            for (int j = 1; j <= 2*(n-i); j++)
                System.out.print("  ");
            for (int j = 1; j <= i; j++)
                System.out.print(" *"); // second row
            System.out.println();
        }
        // Lower Half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            for (int j = 1; j <= 2*(n-i); j++)
                System.out.print("  ");
            for (int j = 1; j <= i; j++)
                System.out.print(" *");
            System.out.println();
        }
        System.out.println("\n--------Rhombus----------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++)
                System.out.print("  ");
            for (int j = 1; j <= 5; j++)
                System.out.print(" *");
            System.out.println();
        }
        System.out.println("\n--------Inverted Rhombus----------");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5-i; j++)
                System.out.print("  ");
            for (int j = 1; j <= 5; j++)
                System.out.print(" *");
            System.out.println();
        }
        System.out.println("\nHollow Rhombus");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++)
                System.out.print("  ");
            for (int j = 1; j <= 5; j++) {
                if(i==1 || j==1 || i==5 || j==5)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\nNumber patrern");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++)
                System.out.print("  ");
            for (int j = 1; j <= i; j++)
                System.out.print(" " + i);
            System.out.println();
        }
        System.out.println("\nNumber patrern");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print(i + " ");
            System.out.println();
        }
        System.out.println("\nPalindromic Pattern");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++)
                System.out.print("  ");
            for (int j = i; j >= 1; j--)
                System.out.print(j + " ");
            for (int j = 2; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
        System.out.println("\nDiamond Pattern");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }// to reverse patterns just reverse the loop on which whole algorithem is dependent
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 4-i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print(" *");
            System.out.println();
        }
        System.out.println();
    }
}