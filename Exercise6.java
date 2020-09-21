import java.util.Scanner;
public class Exercise6 {
    public static void main(String...args){
        Scanner input = new Scanner(System.in);
        int divisor = 10000;
        int tempNumber;
        System.out.println("Enter the five integers of number: ");
        int num = input.nextInt();
        for (int counter = 1; counter <=5; counter++){
            tempNumber = num / divisor;
            System.out.printf("%d   ", tempNumber);
            num = num%divisor;
            divisor/=10;
        }
    }
}
