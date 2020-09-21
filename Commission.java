import java.util.Scanner;

public class Commission {
    public static void main(String...args){
        Scanner enter = new Scanner(System.in);
        int ComCounter = 1;
        System.out.print("\n\t\tWELCOME TO SALES COMMISSION CALCULATOR");
        while(ComCounter<=10){
            System.out.print("\n\nInput your items sold for last week: ");
            double items = enter.nextDouble();
            double comm = 200 + (items * 0.09);
            ComCounter = ComCounter + 1;
            System.out.print("\n\tYour last week commission is: "+"$"+ comm);


        }
    }
}
