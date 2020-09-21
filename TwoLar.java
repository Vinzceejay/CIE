import java.util.Scanner;

public class TwoLar {
    public static void main(String... args) {
        int largest = 0;
        int slargest = 0;
        int numbers;
        int laCounter = 1;
        Scanner enter = new Scanner(System.in);
        System.out.print("\n\t\tFINDING THE TWO LARGEST NUMBER");
        while (laCounter <= 10) {
            System.out.print("\nInsert the numbers \nyou want to compare: ");
            numbers = enter.nextInt();
            if (numbers > largest) {
                slargest = largest;
                largest = numbers;
            }
            if (numbers < largest && numbers > slargest){
                slargest = numbers;
            }

            laCounter++;
        }
        System.out.print("\n\t\tThe Two largest numbers are: " + largest +" And " + slargest);
    }
}
