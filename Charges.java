import java.util.Scanner;

public class Charges {
    public static void main(String... args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("\n\t\tPARKING CHARGES");
        for (int i = 1; i > 0; i++) {
            System.out.print("\n\nEnter your name: ");
            enter.nextLine();
            String name = enter.nextLine();
            System.out.print("\nEnter the hours parked: ");
            int hours = enter.nextInt();
            double p = calculateCharges(hours);
            System.out.print("\nYour name is: " + name + "\nAnd your parking charge is: " +"$"+ p );
        }

    }

    public static double calculateCharges(int hours) {
        double price = 0.00;
        if (hours <= 3) {
            price = 2.00;
        }

        if (hours > 3 && hours <=19) {
            price = 2 + (hours - 3) * 0.5;
        }


        if (hours > 19) {
            price = 10.00;
        }

        return price;
    }
}


