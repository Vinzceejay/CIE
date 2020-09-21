// exercise 2.17
import java.util.Scanner;
public class Exercise4 {
    public static void main(String...args){
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the First number: ");
  int x = input.nextInt();
        System.out.print("Enter the Second number: ");
        int y = input.nextInt();
        System.out.print("Enter the Third number: ");
        int z = input.nextInt();
        int sum = x + y + z;
        int product = x * y * z;
        int average = x + y + z / 3;
        int lar = Math.max(x,y);
        int w = Math.max(lar,z);
        int sma = Math.min(x,y);
        int u = Math.min(sma,z);
        System.out.println("\nThe numbers are:\n");
        System.out.println("The total is: " +sum);
        System.out.println("The product is: " +product);
        System.out.println("The average is: " +average);
        System.out.println("The largest number is: " +w);
        System.out.println("The smallest number is: " +u);
    }
}
