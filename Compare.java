import java.util.Scanner;

public class Compare {
    public static void main(String... args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("\t\tComparing three integers");
        System.out.print("\nInput your three int values");
        int comCounter = 1;
        while (comCounter<=5) {
            System.out.print("\n\nEnter for num1: ");
            int num1 = enter.nextInt();
            System.out.print("\nEnter for num2: ");
            int num2 = enter.nextInt();
            System.out.print("\nEnter for num3: ");
            int num3 = enter.nextInt();
            comCounter = comCounter + 1;
            if (num1 < num2 && num1 < num3) {
                System.out.print("\n" + num1 + " is the smallest");
            }
            if (num2 < num1 && num2 < num3) {
                System.out.print("\n" + num2 + " is the smallest");
            }
            if (num3 < num1 && num3 < num2) {
                System.out.print("\n" + num3 + " is the smallest");
            }
            if (num1 > num2 && num1 > num3) {
                System.out.print("\n" + num1 + " is the largest");
            }

            if (num2 > num1 && num2 > num3) {
                System.out.print("\n" + num2 + " is the largest");
            }
            if (num3 > num1 && num3 > num2) {
                System.out.print("\n" + num3 + " is the largest");
            } else
                System.out.println("They are equal");
        }
    }
}
