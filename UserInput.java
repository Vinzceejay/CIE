import java.util.Scanner;
public class UserInput {
    public static void main(String...args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10) {
            System.out.print("enter your grade: ");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }

        double average = (double) total / 10;
        System.out.printf("%ntotal of all 10 grades is  %d%n", total);
        System.out.printf("%n the average is %.2f%n", average);
    }
}
