import java.util.Scanner;

public class FahCel {
    public static double FahToCel(double fah) {
        return 5.0 / 9.0 * (fah - 32);
    }

    public static double CelToFah(double cel) {
        return 9.0 / 5.0 * (cel + 32);
    }

    public static void main(String... args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Welcome to temperature calculator");
        System.out.println("select an option\n1. Celsius to Fahrenheit\n2. Fahrenheit to celsius\n");
        boolean isCorrect = false;
        do {
            try {
                System.out.print("input 1 or 2: ");
                int option = enter.nextInt();
                if (option == 1) {
                    System.out.print("Enter the celsius temp: ");
                    double cel = enter.nextInt();
                    //conversion to fahrenheit to celsius
                    double ConCel = CelToFah(cel);
                    System.out.print("The answer is " + cel + ConCel);
                } else if (option == 2) {
                    System.out.print("Enter the fahrenheit temp: ");
                    double fah = enter.nextInt();
                    //conversion to fahrenheit to celsius
                    double ConFah = FahToCel(fah);
                    System.out.print("The answer is " + fah + ConFah);
                } else {
                    System.out.println("You entered an incorrect option");
                    continue;
                }
                isCorrect = true;
            } catch (Exception e) {
                System.out.println("Arithmetic Exception!!!");
                enter.nextLine();
            }
        } while (!isCorrect);
    }
}

