import java.util.Scanner;

public class PointsTest {
    public static void main(String...args){
        Scanner enter = new Scanner(System.in);
        System.out.print("\n\t\tGrade checker ");
        System.out.print("\nEnter your name: ");
        String person1 = enter.nextLine();
        System.out.print("Enter your score: ");
        int score1 = enter.nextInt();
        System.out.print("\nEnter your name: ");
        enter.nextLine();
        String person2 = enter.nextLine();
        System.out.print("Enter your score: ");
        int score2 = enter.nextInt();
        Points checker1 = new Points(person1,score1);
        Points checker2 = new Points(person2,score2);
        checker1.Average();
        checker2.Average();
        System.out.print("\n\nYour name is: "+checker1.getName()+"\nAnd your grade is: " +checker1.Average());
        System.out.print("\n\nYour name is: "+checker2.getName()+"\nAnd your grade is: " +checker2.Average());
    }
}
