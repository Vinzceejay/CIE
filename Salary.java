import java.util.Scanner;

public class Salary {
    public static void main(String... args) {
        double pay;
        Scanner enter = new Scanner(System.in);
        int saCounter = 1;
        System.out.print("\n\t\tWELCOME TO SALARY CALCULATOR");
        while (saCounter >0) {
            System.out.print("\n\nEnter your name: ");
            enter.nextLine();
            String name = enter.nextLine();
            System.out.print("\nEnter the number of\nhours worked last week: ");
            int hours = enter.nextInt();
            System.out.print("\nEnter your hourly rate: ");
            int rate = enter.nextInt();
            saCounter++;
            if (hours < 40){
               pay = hours * rate;
                System.out.print("\n\t\tYour name is : "+name);
                System.out.print("\n\t\tYour hours  you inserted was: "+hours);
                System.out.print("\n\t\tYour hourly wage: "+rate);
                System.out.print("\n\t\tThe gross pay is: "+pay);
            }
            else if (hours > 40) {
                int extraHours = hours - 40;
                pay = (40 * rate) + (extraHours * rate);
                System.out.print("\n\t\tYour name is : " + name);
                System.out.print("\n\t\tYour hours  you inserted was: "+hours);
                System.out.print("\n\t\tYour hourly wage: "+rate);
                System.out.print("\n\t\tThe gross pay is: " + pay);
            }


        }
    }
}
