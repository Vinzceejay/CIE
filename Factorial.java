import java.util.Scanner;

public class Factorial {
    public static void main(String... args) {
        Scanner enter = new Scanner(System.in);
        int fCounter = 1;
        System.out.print("\n\t\tFACTORIAL CALCULATION");
        while (fCounter <= 10) {
            System.out.print("\nInsert the number: ");
            int n = enter.nextInt();
            fCounter++;
            int factorial = n * (n - 1)*(n-2);
            System.out.println("\n\t\tThe answer is: " + factorial);
        }
    }
}
