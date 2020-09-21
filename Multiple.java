import java.util.Scanner;

public class Multiple {
    public static void main(String...args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("input the two integers numbers");
        System.out.print("input for a: ");
        int a = enter.nextInt();
        System.out.print("input for b: ");
        int b = enter.nextInt();
        if (a % b == 1 && b % a ==1)
            System.out.println("Is not a multiple of this number");
        if (a % b == 2 && b % a == 2)
            System.out.println("is a multiple of this number");
    }
    }
