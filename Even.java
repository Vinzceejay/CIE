import java.util.Scanner;

public class Even {
    public static void main(String...args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("input the two integers numbers");
        int eCounter = 1;
        while (eCounter <=4) {
            System.out.print("\ninput for a: ");
            int a = enter.nextInt();
            System.out.print("\ninput for b: ");
            int b = enter.nextInt();
            eCounter = eCounter + 1;
            if (a % b == 0)
                System.out.println("\n\tIs an even number");
            if (b % a == 0)
                System.out.println("\n\tis an even number");
            if (a % b == 1)
                System.out.println("\n\tis an odd number");
            if (b % a == 1)
                System.out.println("\n\tis an odd number");

        }
    }
}
