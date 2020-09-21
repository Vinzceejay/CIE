import java.util.Scanner;

public class InvoiceTest {
    public static void main(String...args){
        Scanner enter = new Scanner(System.in);
        System.out.print("\t\tWelcome to our shopping mall");
        System.out.print("\n\nEnter the part number: ");
        String number = enter.nextLine();
        System.out.print("\nWhat the description of the desired item: ");
        String descript = enter.nextLine();
        System.out.print("\nHow many quantity of the desired item \nyou want to purchase: ");
        int quantity = enter.nextInt();
        System.out.print("\nEnter the price of the item\nwhich was indicated on it: ");
        double price = enter.nextDouble();
        Invoice first = new Invoice(number,descript,quantity,price);
        first.getInvoiceAmount();
        System.out.print("\nYour part number is: "+first.getNumber() +"\nAnd the description of the desired product is: "+first.getDescript()+"\nAnd the quantity/quantities you purchased are: "+first.getQuantity()+" items"+"\nThe prices are: " +first.getPrice());
        System.out.print("\n\n\t\tThe total amount of quantity/quantities \npurchased is: "+first.getInvoiceAmount());



    }
}
