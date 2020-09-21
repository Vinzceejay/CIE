import java.util.Scanner;

public class Customers {
    public static void main(String... args) {

        Scanner enter = new Scanner(System.in);
        int cusCounter = 1;
        System.out.print("\n\t\tWELCOME TO CREDIT LIMIT CALCULATOR");
        System.out.print("\n\t USED BY SEVERAL CUSTOMERS");
        try {
            while (cusCounter <= 10) {
                System.out.print("\n Enter your account name: ");
                String name = enter.nextLine();
                enter.nextLine();
                System.out.print("\n Enter your balance at\nthe beginning of the month: ");
                int balance = enter.nextInt();
                System.out.print("\nEnter all the items charged \nby you this month: ");
                int charges = enter.nextInt();
                System.out.print("\nEnter the total of all credits\napplied to your account this month: ");
                int credit = enter.nextInt();
                System.out.print("\nEnter your allowed credit limit: ");
                int allowed = enter.nextInt();
                int nbalance = (balance + charges) - credit;
                System.out.print("Your account name is :" + name + "\nand your balance was: "
                        + balance + "\nAnd your charges were: " + charges + "\nAnd your credit applied was: "
                        + credit + "\nAnd your credit limit is: " + allowed);
                cusCounter = cusCounter + 1;
                System.out.println("\nAnd your new balance is: " + nbalance);
                if (nbalance < allowed)
                    System.out.print("\n\t\t Credit limit not yet exceeded ");
                else if (nbalance > allowed) {
                    System.out.print("\n\t\t Credit limit exceeded");
                }
            }
        } catch (Exception e) {
            System.out.println("Index out of bound");
        }
    }
}