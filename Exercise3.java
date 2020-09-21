// exercise 2.16
import java.util.Scanner;
public class Exercise3 {
    public static void main(String...args){
        Scanner input = new Scanner(System.in);
     System.out.print("Enter the first integer: ");
     int a = input.nextInt();
     System.out.print("Enter the second integer:  ");
     int b = input.nextInt();
     if (a > b)
         System.out.print("Your values were: \nA= " +a +"\nB= "+b);
            System.out.println("\n" +a + " this number is larger");

     if( b > a) {
         System.out.print("Your values were: \nA= " + a + "\nB= " + b);
         System.out.println("\n"+ b + " this number is larger");
     }
     if (a != b) {
         System.out.print("Your values were: \nA= " + a + "\nB= " + b);
         System.out.printf("\n"+ b + " they are not equal ", a, b);
     }

        else
        System.out.println("they are equal");

    }
}
