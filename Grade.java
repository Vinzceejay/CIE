import java.util.*;
public class Grade {
    public static void main(String... args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = enter.nextInt();
        if (score >= 70)
            System.out.print("Your grade is A");
        else if (score >= 60) {
            System.out.print("Your grade is B");
        } else if (score >= 50) {
            System.out.print("Your grade is C");
        } else if (score >= 45) {
            System.out.print("Your grade is D");
        } else if (score >= 30) {
            System.out.print("You failed!!!");
            System.out.print("\nYou must retake the course");
        }
        else
            System.out.print("My candid advice is \nfor you to change school");
    }
}

