import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("\n\t\tCALCULATING COMPOUND INTEREST ");
        System.out.print("\n\nEnter the principle: ");
        double p = enter.nextDouble();
        for (int r = 1; r<= 10; r++){
            System.out.print("\nEnter the the rate: ");
            r = enter.nextInt();
            double t = r / 100;
            double a;
            System.out.println("\nYear\t\t\tAmount on deposit");
            for (int year = 1; year <= 10;  year++) {

                a = p * Math.pow(1.0 + t, year);

                System.out.println("\n " + year + "\t\t\t\t" + a);
            }
        }
    }
}
