import java.util.Scanner;

public class larNum {
    public static void main(String... args) {
        Scanner enter = new Scanner(System.in);
        int laCounter = 1;
        int numbers;
        int largest = 0;
        System.out.print("\n\n\tFINDING THE LARGEST NUMBER");
        while (laCounter <= 10) {
            System.out.print("\nInsert the number of units sold: ");
            numbers = enter.nextInt();
            if (numbers > largest){
                largest = numbers;
            }
            laCounter ++;
        }

        System.out.print("\n\t\tThe largest number: "+largest);

    }
}
