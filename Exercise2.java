// exercise 2.15
import java.util.Scanner;
public class Exercise2 {
    public static void main(String...args){
        Scanner input = new Scanner(System.in);
        // prompting the user to input his number so as to sum it
        System.out.print("enter the first integer number: ");
        int a = input.nextInt();
        System.out.print("enter the second integer number: ");
        int b = input.nextInt();
        int sum = a + b;
        int product = a * b;
        int minus = a - b;
        int div = a / b;
        System.out.print("You entered the the following values\nAnd A = "  +a +"\nB = " +b );
        System.out.print("\n\tThese are the calculations of different signs \n");
        System.out.printf("\nthe sum is: " +sum);
        System.out.printf("\nthe product is: " +product);
        System.out.printf("\nthe difference is: " +minus);
        System.out.printf("\nthe division is: " +div);

    }
}
