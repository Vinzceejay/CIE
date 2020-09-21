import java.util.Scanner;

public class Smallest {
    public static void main(String... args) {
        Scanner enter = new Scanner(System.in);
        int numbs;
        int comp;
        int smal = 0;
        System.out.print("\n\t\tFINDING THE SMALLEST VALUE");
        for (int i = 1; i <= 5; i++) {
            System.out.print("\n\nHow many numbers do you want to compare: ");
            comp = enter.nextInt();
            for (int j = 1; j <= comp; j++) {
                System.out.print("\nInsert your numbers: ");
                 numbs = enter.nextInt();
                if (numbs > 0 && j==1)
                    smal = numbs;
                    if (numbs < smal)
                        smal = numbs;

                }
            System.out.print("\n\t\tThe smallest value is: " + smal);
            }
        }
    }




