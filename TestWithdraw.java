import java.util.Scanner;

public class TestWithdraw {

    public static void main(String...args){
        Scanner enter = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = enter.nextLine();

        System.out.print("Enter your account balance: ");
        double Accbalance = enter.nextDouble();

        System.out.println("Your details\n\t\t"+ "\nName: " +name+"\nAcc_balance: "+ Accbalance);
        System.out.println("\nProcessing your final details\n\t\t\n");
        System.out.print("please kindly enter the amount\n you want to withdraw: ");
        double Withdrawal = enter.nextDouble();
        Withdraw account = new Withdraw(name,Accbalance,Withdrawal);
        account.remAcc(Withdrawal);

        System.out.println("\nsubtracting your Acc_balance from...." +(Withdrawal));
        System.out.println("\n\tDisplaying your final details" +"\nName: "+account.getName()+"\nRemaining Acc balance: "+account.getAccbalance());
        System.out.println("\n\t\t\t\tTHANKS FOR BANKING WITH US!!!");

    }
}
